package com.valdisnei.biblioteca.exception;

public class EmailEmUsoException extends RuntimeException {
    public EmailEmUsoException(String message) {
        super(message);
    }
}