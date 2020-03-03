package bol.project.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import bol.project.java.model.Mancala;

@Controller
public class MancalaController {

  @GetMapping("/")
  public String mancala(Model model) {
    return "mancala";
  }

  @PostMapping("/")
  public String index(Model model) {

    Mancala mancalaBoard = new Mancala();

    model.addAttribute("p1_mancala", mancalaBoard.p1_mancala);
    model.addAttribute("p1_pitsa", mancalaBoard.p1_pits);
    model.addAttribute("p2_mancala", mancalaBoard.p2_mancala);
    model.addAttribute("p2_pits", mancalaBoard.p2_pits);

    return "mancala";
  }

}
