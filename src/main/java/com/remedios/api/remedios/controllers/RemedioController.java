package com.remedios.api.remedios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.api.remedios.DadosCadastroRemedio;
import com.remedios.api.remedios.Remedio;
import com.remedios.api.remedios.RemedioRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @Autowired
    private RemedioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarRemedio(@RequestBody @Valid DadosCadastroRemedio dados) {
        repository.save(new Remedio(dados));
    }

    @GetMapping
    public List<DadosListageRemedio> listar(){
        return repository.findAll().stream().map(DadosListageRemedio::new).toList();
    }

}
