package br.ifms.edu.fronttrabalhos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // definindo essa clase como controladora
@RequestMapping("/") // caminho
public class Pages {


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/sidebar")
    public String sidebar() {
        return "Sidebar";
    }
}
