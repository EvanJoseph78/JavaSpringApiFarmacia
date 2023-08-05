package com.remedios.api.remedios;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Criando endidade para conectar com banco
@Table(name = "Remedio")
@Entity(name = "remedios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Remedio {

    public Remedio(DadosCadastroRemedio dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.via = dados.via();
        this.lote = dados.lote();
        this.quantidade = dados.quantidade();
        this.validade = dados.validade();
        this.laboratorio = dados.laboratorio();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera ids automaticamente no banco
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private Via via;
    private String lote;

    @Enumerated(EnumType.STRING)
    private Laboratorio laboratorio;
    private int quantidade;
    private LocalDate validade;
    private boolean ativo;

    public void atualizarInfomacoes(@Valid DadosAtualizarRemedio dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }

        if (dados.via() != null ) {
            this.via = dados.via();
        }

        if (dados.laboratorio() != null ) {
            this.laboratorio = dados.laboratorio();
        }
    }

    public void inativar() {
        this.ativo = false;
    }

}
