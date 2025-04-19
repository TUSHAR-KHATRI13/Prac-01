package com.example.demo.security;

import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.gen.RSAKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtKeyProvider {

    @Bean
    public RSAKey rsaKey() {
        try {
            return new RSAKeyGenerator(2048)
                    .keyID("auth-key")
                    .generate();
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate RSA key", e);
        }
    }
}
