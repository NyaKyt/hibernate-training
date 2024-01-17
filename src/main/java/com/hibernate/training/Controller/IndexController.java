package com.hibernate.training.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
@GetMapping(path="/")
    public String Home(Model model){return "index";}
}
