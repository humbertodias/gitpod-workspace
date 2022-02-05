package com.example.posts.dto;

import com.example.posts.domain.User;

public class UserDTO {

    private String id;
    private String nome;
    private String email;
    private String telefone;

    public User toEntity(){
        var domain = new User();
        domain.setId(id);
        domain.setEmail(email);
        domain.setName(nome);
        return domain;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
