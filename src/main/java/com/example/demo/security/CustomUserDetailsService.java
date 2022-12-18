package com.example.demo.security;


import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.service.StaffService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final StaffService staffservice;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	        return staffservice.findById(username)
                .map(
                        user -> new CustomUserDetails(
                                user.getStaffNm(),
                                user.getStaffPw(),
                                Collections.emptyList()
                        )
                )
                .orElseThrow(
                        () -> new UsernameNotFoundException(
                                "Given username is not found. (username = '" + username + "')"
                        )
                );
    }

}
