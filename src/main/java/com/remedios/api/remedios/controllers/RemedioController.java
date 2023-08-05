package com.remedios.api.remedios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.api.remedios.DadosAtualizarRemedio;
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

    /**
     * @param dados
     *              Responsável pela criação de registros
     */
    @PostMapping
    @Transactional
    public void cadastrarRemedio(@RequestBody @Valid DadosCadastroRemedio dados) {
        repository.save(new Remedio(dados));
    }

    /**
     * @return
     *         Responsável pela listagem dos registros
     */
    @GetMapping
    public List<DadosListagemRemedio> listar() {
        return repository.findAllByAtivoTrue().stream().map(DadosListagemRemedio::new).toList();
    }

    /**
     * @param dados
     *              Responsável pela atualização de um registro
     * 
     */
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarRemedio dados) {
        var remedio = repository.getReferenceById(dados.id());
        remedio.atualizarInfomacoes(dados);

    }

    /**
     * @param id
     *           Responsável por excluir um registro
     */
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @DeleteMapping("inativar/{id}")
    @Transactional
    public void inativar(@PathVariable Long id) {
        var remedio = repository.getReferenceById(id);
        remedio.inativar();
    }
    
}
