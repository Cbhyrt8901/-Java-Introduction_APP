package com.example.demo.service;
import org.springframework.stereotype.Service;

@Service
public class YamamotoService {
    public String getProfile() {
        return "メンバーの山本です！趣味は猫吸いです。";
    }
}