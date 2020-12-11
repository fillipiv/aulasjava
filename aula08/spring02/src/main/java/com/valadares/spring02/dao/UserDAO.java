package com.valadares.spring02.dao;

import com.valadares.spring02.model.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// CRUD - Creat Read Update Dele > dentro do repositório tem as 4 operações definidas, não precisa de criação
public interface UserDAO extends CrudRepository<User, Integer> {

    public User findByEmail(String email);

    public User findByEmailAndPassword(String email, String password);

    public User findByEmailOrCpf(String email, String cpf);

    @Query(value="Select new User(u.name, u.email) from User u where u.id = :cod") // parametro nomeado - com o codigo informado no controller, busque na table u.id
    public User buscaPorId (@Param("cod") Integer codigo); // necessario criar construtor com dois parâmetros para dar certo.

    @Query(value="Select name, email from user where id = :cod", nativeQuery = true)
    public Object buscarUsuariosPorId(@Param("cod") Integer codigo);
}
