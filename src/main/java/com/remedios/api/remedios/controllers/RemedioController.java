package com.remedios.api.remedios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.api.remedios.DadosCadastroRemedio;
import com.remedios.api.remedios.Remedio;
import com.remedios.api.remedios.RemedioRepository;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @Autowired
    private RemedioRepository repository;

    @PostMapping
    public void cadastrarRemedio(@RequestBody DadosCadastroRemedio dados) {
        repository.save(new Remedio(dados));
    }

}
