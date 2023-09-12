package com.jwt.service;

import com.jwt.Repository.UserRepository;
import com.jwt.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author nawaz
 */
@Service
public class CustomUserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //load user from database
        return userRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("User not found !!"));
    }
}