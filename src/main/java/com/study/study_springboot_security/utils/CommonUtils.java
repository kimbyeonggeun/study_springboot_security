package com.study.study_springboot_security.utils;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CommonUtils {
    // 자동 uid 채번
    public String getUniqueSequence() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
