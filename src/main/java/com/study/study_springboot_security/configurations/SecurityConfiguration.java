package com.study.study_springboot_security.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        // None using csrf protection
        httpSecurity.csrf().disable();
        // 권한에 대한 부분 - url & roles : user url & roles
        httpSecurity.authorizeRequests()
                // .antMatchers("/").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
                // .antMatchers("/").authenticated() // authenticated() - 로그인 여부만 판단
                .antMatchers("/user").authenticated() // .access("hasRole('ROLE_ADMIN')") // access - 권한 체크
                .antMatchers("/manager/*").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_MANAGER')") // access - 권한 체크
                .antMatchers("/admin/*").access("hasRole('ROLE_ADMIN')") // access - 권한 체크
                .anyRequest().permitAll(); // 설정한 URL외에는 모두 접근 가능

        // 로그인에 대한 부분
        httpSecurity.formLogin().loginPage("/loginForm")
                .failureUrl("/loginForm?fail=true") // 로그인 실패시 가는 링크
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/"); // ROLE_ADMIN -> /admin

        return httpSecurity.build();
    }

    @Bean
    public BCryptPasswordEncoder encoderPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
