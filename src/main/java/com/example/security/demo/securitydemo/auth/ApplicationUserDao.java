package com.example.security.demo.securitydemo.auth;


import java.util.Optional;



public interface ApplicationUserDao {

    Optional<ApplicationUser> selectApplicationUserByUsername(String username);

}
