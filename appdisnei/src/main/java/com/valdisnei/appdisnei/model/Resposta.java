package com.valdisnei.appdisnei.model;


import org.springframework.stereotype.Component;

@Component
public class Resposta {

    private String mensagens;

    public String getMensagens() {
        return mensagens;
    }
    public void setMensagens(String mensagens) {
        this.mensagens = mensagens;
    }
}
