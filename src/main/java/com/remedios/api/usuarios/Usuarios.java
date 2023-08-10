package com.remedios.api.usuarios;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Usuario")
@Entity(name = "usuarios")
@Getter
@Setter
@AllArgsConstructor

@EqualsAndHashCode(of = "id")

public class Usuarios {
  private Long id;
  private String login;
  private String senha;
}
