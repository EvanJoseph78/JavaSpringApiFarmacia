package com.remedios.api.remedios.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class TratamentoDeExcecoes {

  @ExceptionHandler(EntityNotFoundException.class)
  public ResponseEntity<?> tratador404() {
    return ResponseEntity.notFound().build();
  }

}
