package oit.is.group2.lec5.group2lec5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample5")
public class Sample51Controller {

  @GetMapping("step1")
  public String sample51() {
    return "sample51.html";
  }

}
