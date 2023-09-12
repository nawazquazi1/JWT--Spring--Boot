package com.jwt.controller;

import com.jwt.entities.User;
import com.jwt.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

/**
 * @author nawaz
 */
@RestController
public class HomeController {

    @Autowired
    private UserService userService;

    //http://localhost:8081/home/users
    @GetMapping("/users")
    public List<User> getUser() {
        return userService.getUsers();

    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }
}