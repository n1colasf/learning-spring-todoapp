package com.nicolasf.learningspringtodoapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    //http://localhost:8080/login?name=nicolas
    @RequestMapping("login")
    public String goToLogin(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        System.out.println("Request param is " + name); // NOT RECOMMENDED FOR PRODUCTION
        return "login";
    }
}
