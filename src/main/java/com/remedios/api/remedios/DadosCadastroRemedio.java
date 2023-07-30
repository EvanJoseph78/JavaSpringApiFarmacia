package com.remedios.api.remedios;

// Criação do DTO - data tranfer object
public record DadosCadastroRemedio(
    String nome,
    Via via,
    String lote,
    Laboratorio laboratorio,
    String quantidade,
    String validade

) {
}
