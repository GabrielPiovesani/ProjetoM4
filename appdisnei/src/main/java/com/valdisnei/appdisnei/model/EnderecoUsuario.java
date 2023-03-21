package com.valdisnei.appdisnei.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class EnderecoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String logradouro, bairro, cidade, numeroDaCasa, complemento;

    @ManyToMany
    private List<Usuario> usuario;
//    CONSTRUTOR
    public EnderecoUsuario() {
    }

    public EnderecoUsuario(int id, String logradouro, String bairro, String cidade, String numeroDaCasa, String complemento) {
        this.id = id;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numeroDaCasa = numeroDaCasa;
        this.complemento = complemento;
    }

//    GET AND SET


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(String numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
