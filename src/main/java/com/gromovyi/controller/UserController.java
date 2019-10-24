package com.gromovyi.controller;

import static com.gromovyi.constraints.TemplateNameConstratints.HELLO_PAGE;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/hello")
    public String getHelloPage(){
      return HELLO_PAGE;
    }
}
