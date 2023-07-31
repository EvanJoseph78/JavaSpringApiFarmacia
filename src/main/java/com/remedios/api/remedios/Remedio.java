package com.remedios.api.remedios;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // gera ids automaticamente no banco
    private Long id;
    private String nome;
    
    @Enumerated(EnumType.STRING)
    private Via via;
    private String lote;

    @Enumerated(EnumType.STRING)
    private Laboratorio laboratorio;
    private String quantidade;
    private String validade;

}
    