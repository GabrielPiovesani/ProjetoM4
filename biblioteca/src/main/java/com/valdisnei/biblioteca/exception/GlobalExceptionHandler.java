package com.valdisnei.biblioteca.exception;

import com.valdisnei.biblioteca.dtos.mensagem.ErroResposta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EmailEmUsoException.class)
    public ResponseEntity<ErroResposta> handleEmailEmUsoException(EmailEmUsoException ex) {
        ErroResposta erroResposta = new ErroResposta("Email já está em uso", HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erroResposta);
    }
}
