package com.valadares.spring02.dao;

import com.valadares.spring02.model.Anuncio;
import org.springframework.data.repository.CrudRepository;

public interface AnuncioDAO extends CrudRepository<Anuncio, Integer> {
}
