package com.nicolasf.learningspringtodoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class LoginController {
    //http://localhost:8080/login?name=nicolas

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLogin() { //goToLogin(@RequestParam String name, ModelMap model) {
        // model.put("name", name);
        // could be logger.info, logger.warn, logger.error
        //logger.debug("Request param is {}", name); // use a logger for displaying  messages
        //System.out.println("Request param is " + name); // NOT RECOMMENDED FOR PRODUCTION
        return "login";
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcome(@RequestParam String name, @RequestParam String pass, ModelMap model) {

        if (authenticationService.authenticate(name, pass)) {
            model.put("name", name);
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials");
        return "login";
    }
}
