package com.nicolasf.learningspringtodoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
    //http://localhost:8080/login?name=nicolas
    /*
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
    */
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToWelcomePage(ModelMap model) { //goToLogin(@RequestParam String name, ModelMap model) {
        model.put("name", "nicolas");
        // could be logger.info, logger.warn, logger.error
        //logger.debug("Request param is {}", name); // use a logger for displaying  messages
        //System.out.println("Request param is " + name); // NOT RECOMMENDED FOR PRODUCTION
        return "welcome";
    }
   /*
   @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcome(@RequestParam String name, @RequestParam String pass, ModelMap model) {

        if (authenticationService.authenticate(name, pass)) {
            model.put("name", name);
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials");
        return "login";
    }
    */
}
