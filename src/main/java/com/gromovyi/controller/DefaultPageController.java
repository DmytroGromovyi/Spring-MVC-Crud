package com.gromovyi.controller;

import static com.gromovyi.constraints.TemplateNameConstratints.INDEX_PAGE;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DefaultPageController {

  @RequestMapping("/")
  public String getHomePage() {
    return INDEX_PAGE;
  }

}
