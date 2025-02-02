package com.example.springconceitos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/* A cada nova requisicao, eu recebo todas as informacoes
que eu preciso para fazer aquela funconalidade que o cliente
está pedindo
 */
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }


}
