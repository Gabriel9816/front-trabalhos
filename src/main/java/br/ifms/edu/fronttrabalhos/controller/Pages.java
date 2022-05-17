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
    @GetMapping("/dashadmin")
    public String dashadmin() {
        return "dashboard_admin";
    }
    @GetMapping("/dash")
    public String dash() {
        return "dash";
    }
    @GetMapping("/teste")
    public String teste() {
        return "sidebar_and_navbar";
    }
    @GetMapping("/facade")
    public String facade() {
        return "facade";
    }
}
