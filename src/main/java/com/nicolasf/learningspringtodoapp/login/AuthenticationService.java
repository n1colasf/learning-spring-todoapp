package com.nicolasf.learningspringtodoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate (String username, String password) {
        boolean validName = username.equals("nicolas");
        boolean validPass = password.equals("1234");

        return validName && validPass;
    }
}
