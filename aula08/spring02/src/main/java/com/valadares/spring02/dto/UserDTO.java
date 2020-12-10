package com.valadares.spring02.dto;

import com.valadares.spring02.model.User;

// DTO - Data Transfer Object

public class UserDTO {
    private String name;
    private String email;
    private String cpf;

    public UserDTO(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.cpf = user.getCpf();
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
