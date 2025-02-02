package com.example.springconceitos.controller;

import com.example.springconceitos.domain.User;
import com.example.springconceitos.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
/* A cada nova requisicao, eu recebo todas as informacoes
que eu preciso para fazer aquela funconalidade que o cliente
está pedindo
 */
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;



    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld( "Emanoel");
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World Post" + body.getName();
    }

}
