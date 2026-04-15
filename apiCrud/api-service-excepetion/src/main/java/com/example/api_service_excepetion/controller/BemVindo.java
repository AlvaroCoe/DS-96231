package com.example.api_service_excepetion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BemVindo {
    @GetMapping("/")
    public String  mensagem () {
        return "Bem Vindo";
    }

    @GetMapping("/dev")
    public String nomeDev () {
        return "Meu nome é Alvaro";
    }
}