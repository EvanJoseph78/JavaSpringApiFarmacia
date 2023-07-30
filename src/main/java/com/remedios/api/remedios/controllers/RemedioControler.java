package com.remedios.api.remedios.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.api.remedios.DadosCadastroRemedio;

@RestController
@RequestMapping("/remedios")
public class RemedioControler {
    @GetMapping
    public void cadastrarRemedio(@RequestBody DadosCadastroRemedio json) {
        System.out.println(json);
    }
}
