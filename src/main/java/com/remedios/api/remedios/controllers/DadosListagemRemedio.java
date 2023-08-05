package com.remedios.api.remedios.controllers;

import java.time.LocalDate;

import com.remedios.api.remedios.Laboratorio;
import com.remedios.api.remedios.Remedio;
import com.remedios.api.remedios.Via;

public record DadosListagemRemedio(
        Long id,
        String nome,
        Via via,
        String lote,
        Laboratorio laboratorio,
        LocalDate validade) {

    public DadosListagemRemedio(Remedio remedio) {
        this(
                remedio.getId(),
                remedio.getNome(),
                remedio.getVia(),
                remedio.getLote(),
                remedio.getLaboratorio(),
                remedio.getValidade());
    }
}
