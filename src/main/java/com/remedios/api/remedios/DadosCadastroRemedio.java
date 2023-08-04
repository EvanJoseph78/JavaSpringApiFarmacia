package com.remedios.api.remedios;

import java.time.LocalDate;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

// Criação do DTO - data tranfer object
public record DadosCadastroRemedio(

        @NotBlank String nome,
        @Enumerated Via via,
        @NotBlank String lote,

        int quantidade,
        
        @Future
        LocalDate validade,
        @Enumerated
        Laboratorio laboratorio

) {
}
