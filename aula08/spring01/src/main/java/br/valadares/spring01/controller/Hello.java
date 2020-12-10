package br.valadares.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica classe controller do tipo rest
@CrossOrigin("*") // aceita pedidos de qualquer origem
@RequestMapping("/start") // padrão de requisição para esta classe (começando com /start)

public class Hello {
    
    @GetMapping("/hello") // método GET com uri "/hello", não necessariamente nome do método
    public String hello(){
        return "Hello World!";
    }
}
