package com.example.demo.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;


@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {


	@Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.formLogin(login -> login
        			.loginProcessingUrl("/admin/login")
        			.loginPage("/admin/login")
        			.defaultSuccessUrl("/admin/top",true)
        			.permitAll()
        		).logout(logout -> logout
        				.logoutSuccessUrl("/logout")
        		).authorizeRequests(authz -> authz
        				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
        				.mvcMatchers("/admin/login").permitAll()
        				.mvcMatchers("/user/**").permitAll()
        				.anyRequest().authenticated()
                );
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new Pbkdf2PasswordEncoder();
    }
}
