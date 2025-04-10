package com.eai.Eai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/dev/get")
    @PostMapping("/dev/post")
    public String boasVindas(){
        return "Teste rota\n\n java";
    }

    @PostMapping("/dev/teste/post")
    public String testePost(){
        return "Teste de post";
    }
}
