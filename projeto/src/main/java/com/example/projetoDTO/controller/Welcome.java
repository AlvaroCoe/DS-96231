package com.example.projetoDTO.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping ("/")
    public String mensagem () {
        return "Seja bem Vindo";
    }
    @GetMapping ("/dev")
    public String aluno () {
        return "Meu nome é Alvaro Coelho";
    }
}
