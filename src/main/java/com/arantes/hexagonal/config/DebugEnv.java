package com.arantes.hexagonal.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DebugEnv {
    public DebugEnv(@Value("${MONGODB_URI:NOT_FOUND}") String uri) {
        System.out.println(">>>>> MONGODB_URI = " + uri);
    }
}
