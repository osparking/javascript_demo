package space.bum.js_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
  @GetMapping("/")
  public String comeHome() {
    return "javascriptDemo.html";
  }

  @PostMapping("/")
  public String processName(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "showname.html";
  }

}
