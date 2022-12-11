package com.example.demo.config;

import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.repsitry.StaffRepositorydao;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final StaffRepositorydao staffrepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	        return staffrepository.findById(username)
                .map(
                        user -> new CustomUserDetails(
                                user.getStaff_nm(),
                                user.getStaff_pw(),
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
