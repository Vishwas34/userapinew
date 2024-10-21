package com.api;


import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class otpservice {
    public String generateOtp() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000); // 6-digit OTP
        return String.valueOf(otp);
    }

    public void sendOtp(String phoneNumber, String otp) {
        // Logic to send OTP via SMS (use an SMS API)
        System.out.println("Sending OTP " + otp + " to " + phoneNumber);
    }
}
