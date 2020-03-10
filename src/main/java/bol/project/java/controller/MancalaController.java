package bol.project.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import bol.project.java.model.Mancala;

@Controller
public class MancalaController {

  @GetMapping("/")
  public String index(Model model) {
    Mancala mancalaBoard = new Mancala();

    model.addAttribute("mancala_P1", mancalaBoard.getMancalaBoard()[0]);
    model.addAttribute("P1_pit1", mancalaBoard.getMancalaBoard()[1]);
    model.addAttribute("P1_pit2", mancalaBoard.getMancalaBoard()[2]);
    model.addAttribute("P1_pit3", mancalaBoard.getMancalaBoard()[3]);
    model.addAttribute("P1_pit4", mancalaBoard.getMancalaBoard()[4]);
    model.addAttribute("P1_pit5", mancalaBoard.getMancalaBoard()[5]);
    model.addAttribute("P1_pit6", mancalaBoard.getMancalaBoard()[6]);

    model.addAttribute("mancala_P2", mancalaBoard.getMancalaBoard()[7]);
    model.addAttribute("P2_pit1", mancalaBoard.getMancalaBoard()[8]);
    model.addAttribute("P2_pit2", mancalaBoard.getMancalaBoard()[9]);
    model.addAttribute("P2_pit3", mancalaBoard.getMancalaBoard()[10]);
    model.addAttribute("P2_pit4", mancalaBoard.getMancalaBoard()[11]);
    model.addAttribute("P2_pit5", mancalaBoard.getMancalaBoard()[12]);
    model.addAttribute("P2_pit6", mancalaBoard.getMancalaBoard()[13]);

    return "mancala";
  }

}
