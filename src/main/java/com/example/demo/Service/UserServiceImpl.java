package com.example.demo.Service;

import com.example.demo.models.security.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/*
* Because we want to get users and roles from the database,
* we need to tell Spring Security how to get this data.
* To do it we have to provide an implementation of the
* UserDetailsService interface
* */
@Service
public class UserServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user =userRepository.findByUsername(username);

        if(user != null){
            return user;
        }

        throw new UsernameNotFoundException(username);
    }
}
