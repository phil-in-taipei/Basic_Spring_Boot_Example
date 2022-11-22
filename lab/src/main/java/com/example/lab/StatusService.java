package com.example.lab;
import org.springframework.stereotype.Service;
@Service
public class StatusService {
    public String processStatus(boolean arriving) {
        if (arriving) {
            return "springFundamentals/hello";
        } else {
            return "springFundamentals/goodbye";
        }
    }
}
