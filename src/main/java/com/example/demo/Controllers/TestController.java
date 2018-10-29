package com.example.demo.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured")
public class TestController {

    @GetMapping("/all-admin")
    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    @PreAuthorize("hasAuthority('Admin')")
    public String getAll(){
        return "Secured link admin";
    }

    @GetMapping("/all-user")
    @PreAuthorize("hasAuthority('User')")
    //@PreAuthorize("hasRole('USER')")
    public String getAllUser(){
        return "Secured link user";
    }
}
