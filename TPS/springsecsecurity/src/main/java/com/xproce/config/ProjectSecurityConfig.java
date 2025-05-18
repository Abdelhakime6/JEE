package com.xproce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


public class ProjectSecurityConfig {
    private static final String[] AUTH_WHITELIST = {
            "/notices",
            "contact",
            "/register"
    };
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.requestMatchers(AUTH_WHITELIST).permitAll()
                .anyRequest().authenticated());
        return http.build();
    }

}
