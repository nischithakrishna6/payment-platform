package com.fintech.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/")
    public Map<String, String> home() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "running");
        response.put("message", "NexaVault Backend API");
        response.put("version", "1.0.0");
        return response;
    }

    @GetMapping("/api/test")
    public Map<String, String> test() {
        Map<String, String> response = new HashMap<>();
        response.put("test", "success");
        response.put("timestamp", String.valueOf(System.currentTimeMillis()));
        return response;
    }
}