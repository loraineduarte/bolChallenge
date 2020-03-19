package bol.project.java.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import bol.project.java.model.Mancala;

@Controller
public class MancalaController {

  // Set a validator
  @InitBinder
  protected void initBinder(WebDataBinder binder) {
    // binder.setValidator();
  }

  Mancala mancalaBoard = Mancala.getInstance();

  @GetMapping("/")
  public String index(Model model) {

    model.addAttribute("mancala", mancalaBoard);
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

  // 1. @ModelAttribute bind form value
  // 2. @Validated form validator
  // 3. RedirectAttributes for flash value
  @RequestMapping(value = "/board", method = RequestMethod.POST)
  public String updateBoard(@ModelAttribute("mancala") @Validated Integer position, BindingResult result, Model model,
      final RedirectAttributes redirectAttributes) {

    if (result.hasErrors()) {
      populateDefaultModel(model);
      return "users/userform";

    } else {

      redirectAttributes.addFlashAttribute("css", "success");

      return "redirect:/board/" + mancalaBoard + "/update";

    }

  }

  // show update
  @RequestMapping(value = "/board/{mancala}/update", method = RequestMethod.GET)
  public String showUpdateUserForm(@PathVariable("mancala") Mancala mancala, Model model) {

    model.addAttribute("mancala", mancalaBoard);

    populateDefaultModel(model);

    return "users/userform";

  }

  private void populateDefaultModel(Model model) {

    List<String> frameworksList = new ArrayList<String>();
    frameworksList.add("Spring MVC");
    frameworksList.add("Struts 2");
    frameworksList.add("JSF 2");
    frameworksList.add("GWT");
    frameworksList.add("Play");
    frameworksList.add("Apache Wicket");
    model.addAttribute("frameworkList", frameworksList);

    Map<String, String> skill = new LinkedHashMap<String, String>();
    skill.put("Hibernate", "Hibernate");
    skill.put("Spring", "Spring");
    skill.put("Struts", "Struts");
    skill.put("Groovy", "Groovy");
    skill.put("Grails", "Grails");
    model.addAttribute("javaSkillList", skill);

    Map<String, Integer> board = new LinkedHashMap<String, Integer>();
    board.put("mancala_P1", mancalaBoard.getMancalaBoard()[0]);
    board.put("P1_pit1", mancalaBoard.getMancalaBoard()[1]);
    board.put("P1_pit2", mancalaBoard.getMancalaBoard()[2]);
    board.put("P1_pit3", mancalaBoard.getMancalaBoard()[3]);
    board.put("P1_pit4", mancalaBoard.getMancalaBoard()[4]);
    board.put("P1_pit5", mancalaBoard.getMancalaBoard()[5]);
    board.put("P1_pit6", mancalaBoard.getMancalaBoard()[6]);

    board.put("mancala_P2", mancalaBoard.getMancalaBoard()[7]);
    board.put("P2_pit1", mancalaBoard.getMancalaBoard()[8]);
    board.put("P2_pit2", mancalaBoard.getMancalaBoard()[9]);
    board.put("P2_pit3", mancalaBoard.getMancalaBoard()[10]);
    board.put("P2_pit4", mancalaBoard.getMancalaBoard()[11]);
    board.put("P2_pit5", mancalaBoard.getMancalaBoard()[12]);
    board.put("P2_pit6", mancalaBoard.getMancalaBoard()[13]);

    model.addAttribute("mancala", board);
  }

}
