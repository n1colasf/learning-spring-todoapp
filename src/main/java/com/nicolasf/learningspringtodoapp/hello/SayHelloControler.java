package com.nicolasf.learningspringtodoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloControler {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World! Learning Spring Framework is fun!";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHTML() {
        StringBuffer html = new StringBuffer();
        html.append("<html>");
        html.append("<head>");
        html.append("<title>My First HTML Page</title>");
        html.append("</head>");
        html.append("<body>");
        html.append("<h1>Hello World! Learning Spring Framework is fun!</h1>");
        html.append("</body>");
        html.append("</html>");

        return html.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJSP() {
        return "sayHello";
    }

}
