package br.com.fiap._tdszmvc.controller;

import br.com.fiap._tdszmvc.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @GetMapping("/ola")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World!");
        return "hello"; // nome do template html
    }

    @GetMapping("/ola2")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message", "Hello World!");
        return mv;
    }
}
