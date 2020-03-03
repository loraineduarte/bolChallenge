package bol.project.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MancalaController {

  @GetMapping("/")
  public String mancala() {
    return "mancala";
  }

}
