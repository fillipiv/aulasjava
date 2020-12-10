package com.valadares.spring02.dao;

import com.valadares.spring02.model.User;

import org.springframework.data.repository.CrudRepository;

// CRUD - Creat Read Update Dele > dentro do repositório tem as 4 operações definidas, não precisa de criação
public interface UserDAO extends CrudRepository<User, Integer> {

    public User findByEmail(String email);

    public User findByEmailAndPassword(String email, String password);

    public User findByEmailOrCpf(String email, String cpf);
}
