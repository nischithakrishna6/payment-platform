package com.fintech.platform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration config = new CorsConfiguration();

        // Allow frontend origins
        config.setAllowedOrigins(List.of(
                "http://localhost:4200",
                "https://nexavault-frontend.onrender.com"
        ));

        // Allow credentials (JWT, cookies, Authorization headers)
        config.setAllowCredentials(true);

        // Allow all headers
        config.setAllowedHeaders(List.of("*"));

        // Allow all HTTP methods (important for preflight)
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH"));

        // Cache preflight response (improves performance)
        config.setMaxAge(3600L);

        // Register config for all endpoints
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        return source;
    }
}