package com.example.dto_revisao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping ("/")
    public String mensagem (){
        return "Sejam bem-vindos(as)";
    }
    @GetMapping ("/dev")
    public String dev (){
        return "Meu nome é Alvaro Coelho, aluno do SENAI BA Dendezeiros.";
    }

}
