package com.valadares.spring02.controller;

import java.util.List;

import com.valadares.spring02.dao.AnuncioDAO;
import com.valadares.spring02.model.Anuncio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/anuncio")
public class AnuncioController {
    
    @Autowired
    private AnuncioDAO dao;

    @GetMapping("/all")
    public List<Anuncio> listarTodos(){
        List<Anuncio> lista = (List<Anuncio>) dao.findAll(); 
            return lista;
    }
}
