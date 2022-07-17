package org.ludi.springhello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("controllername", HelloController.class);
        return "hello";
    }

    @RequestMapping("/etf")
    public String eingeben() {
        return "etf-form";
    }
}
