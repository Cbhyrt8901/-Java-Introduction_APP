package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HidaService {
    public String getProfile() {
        return "メンバーの田中です！趣味は趣味はドライブです。";
    }
}
