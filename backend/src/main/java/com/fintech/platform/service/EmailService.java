package com.fintech.platform.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    @Value("${app.mail.from}")
    private String fromEmail;

    @Value("${app.name}")
    private String appName;

    // ✅ OTP Email (existing)
    public void sendOTPEmail(String toEmail, String otp) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");

            helper.setFrom(fromEmail);
            helper.setTo(toEmail);
            helper.setSubject("Password Reset OTP - " + appName);

            String htmlContent = buildOTPEmailTemplate(otp);
            helper.setText(htmlContent, true);

            mailSender.send(message);
            System.out.println("✅ OTP email sent successfully to: " + toEmail);

        } catch (MessagingException e) {
            System.err.println("❌ Failed to send OTP email: " + e.getMessage());
            throw new RuntimeException("Failed to send OTP email", e);
        }
    }

    // ✅ Transaction Email (new)
    public void sendTransactionEmail(String toEmail, String userName, String transactionType,
                                     double amount, double remainingBalance, String transactionId) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");

            helper.setFrom(fromEmail);
            helper.setTo(toEmail);
            helper.setSubject(transactionType + " Alert - " + appName);

            String htmlContent = buildTransactionEmailTemplate(userName, transactionType, amount, remainingBalance, transactionId);
            helper.setText(htmlContent, true);

            mailSender.send(message);
            System.out.println("✅ Transaction email sent to: " + toEmail);

        } catch (MessagingException e) {
            System.err.println("❌ Failed to send transaction email: " + e.getMessage());
            throw new RuntimeException("Failed to send transaction email", e);
        }
    }

    // ✅ OTP Template (existing)
    private String buildOTPEmailTemplate(String otp) {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <style>
                    body { font-family: Arial, sans-serif; line-height: 1.6; color: #333; max-width: 600px; margin: 0 auto; padding: 20px; }
                    .container { background: #f9f9f9; border-radius: 10px; padding: 30px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
                    .header { text-align: center; margin-bottom: 30px; }
                    .header h1 { color: #7c5cbf; margin: 0; }
                    .otp-box { background: white; border: 2px dashed #7c5cbf; border-radius: 8px; padding: 20px; text-align: center; margin: 20px 0; }
                    .otp-code { font-size: 32px; font-weight: bold; color: #7c5cbf; letter-spacing: 8px; margin: 10px 0; }
                    .footer { text-align: center; margin-top: 30px; color: #666; font-size: 14px; }
                    .warning { background: #fff3cd; border-left: 4px solid #ffc107; padding: 15px; margin: 20px 0; }
                </style>
            </head>
            <body>
                <div class="container">
                    <div class="header"><h1>Password Reset Request</h1></div>
                    <p>Hello,</p>
                    <p>You requested to reset your password for <strong>%s</strong>.</p>
                    <p>Use the following One-Time Password (OTP) to complete the process:</p>
                    <div class="otp-box">
                        <div>Your OTP Code:</div>
                        <div class="otp-code">%s</div>
                    </div>
                    <div class="warning">
                        ⚠️ <strong>Important:</strong><br>
                        • This OTP is valid for <strong>10 minutes</strong><br>
                        • Do not share this code with anyone<br>
                        • If you didn't request this, please ignore this email
                    </div>
                    <p>If you have any questions, please contact our support team.</p>
                    <div class="footer">
                        <p>This is an automated email. Please do not reply.</p>
                        <p>&copy; 2026 %s. All rights reserved.</p>
                    </div>
                </div>
            </body>
            </html>
            """.formatted(appName, otp, appName);
    }

    // ✅ Transaction Template (new)
    private String buildTransactionEmailTemplate(String userName, String transactionType,
                                                 double amount, double remainingBalance, String transactionId) {
        boolean isCredited = transactionType.equalsIgnoreCase("CREDITED");
        String color = isCredited ? "#28a745" : "#dc3545";
        String icon = isCredited ? "↑" : "↓";
        String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a"));

        return """
            <!DOCTYPE html>
            <html>
            <head>
                <style>
                    body { font-family: Arial, sans-serif; line-height: 1.6; color: #333; max-width: 600px; margin: 0 auto; padding: 20px; }
                    .container { background: #f9f9f9; border-radius: 10px; padding: 30px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
                    .header { text-align: center; margin-bottom: 30px; }
                    .header h1 { color: #7c5cbf; margin: 0; }
                    .transaction-box { background: white; border-radius: 8px; padding: 20px; margin: 20px 0; border-left: 5px solid %s; }
                    .amount { font-size: 28px; font-weight: bold; color: %s; margin: 10px 0; }
                    .details-table { width: 100%%; border-collapse: collapse; margin: 20px 0; }
                    .details-table td { padding: 10px; border-bottom: 1px solid #eee; }
                    .details-table td:first-child { font-weight: bold; color: #666; width: 40%%; }
                    .balance-box { background: #7c5cbf; color: white; border-radius: 8px; padding: 15px; text-align: center; margin: 20px 0; }
                    .balance-amount { font-size: 24px; font-weight: bold; margin-top: 5px; }
                    .footer { text-align: center; margin-top: 30px; color: #666; font-size: 14px; }
                </style>
            </head>
            <body>
                <div class="container">
                    <div class="header"><h1>Transaction Alert</h1></div>
                    <p>Dear <strong>%s</strong>,</p>
                    <p>Your account has been <strong>%s</strong>.</p>
                    <div class="transaction-box">
                        <div>Amount %s:</div>
                        <div class="amount">%s ₹%.2f</div>
                    </div>
                    <table class="details-table">
                        <tr><td>Transaction ID</td><td>%s</td></tr>
                        <tr><td>Type</td><td>%s</td></tr>
                        <tr><td>Date & Time</td><td>%s</td></tr>
                    </table>
                    <div class="balance-box">
                        <div>Remaining Balance</div>
                        <div class="balance-amount">₹%.2f</div>
                    </div>
                    <p>If you did not authorize this transaction, please contact support immediately.</p>
                    <div class="footer">
                        <p>This is an automated email. Please do not reply.</p>
                        <p>&copy; 2026 %s. All rights reserved.</p>
                    </div>
                </div>
            </body>
            </html>
            """.formatted(
                color, color,
                userName, transactionType.toLowerCase(),
                transactionType, icon, amount,
                transactionId, transactionType, dateTime,
                remainingBalance, appName
        );
    }

    // ✅ Simple text fallback (existing)
    public void sendSimpleOTPEmail(String toEmail, String otp) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(toEmail);
        message.setSubject("Password Reset OTP - " + appName);
        message.setText(String.format(
                "Your OTP for password reset is: %s\n\nThis OTP is valid for 10 minutes.\n" +
                        "Do not share this code with anyone.\n\nIf you didn't request this, please ignore this email.\n\nRegards,\n%s Team",
                otp, appName
        ));
        mailSender.send(message);
    }
}