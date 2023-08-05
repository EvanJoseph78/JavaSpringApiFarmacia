package com.remedios.api.remedios;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarRemedio(
        @NotNull Long id,
        String nome,
        Via via,
        Laboratorio laboratorio) {

}
