package com.valadares.spring02.controller;

import java.util.List;

import com.valadares.spring02.dao.UserDAO;
import com.valadares.spring02.dto.UserDTO;
import com.valadares.spring02.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    
    @Autowired // injeção de dependência
    private UserDAO dao;
    
    @GetMapping("/all")
    public List<User> listarTodos(){
        List<User> lista = (List<User>) dao.findAll(); // método próprio do crude, instanciado a partir do autowired e objeto dao
        return lista;
    }

    @GetMapping("/id/{id}") // {nome da variável}
    public ResponseEntity<User> BuscaPorId(@PathVariable int id){
        User user = dao.findById(id).orElse(null);

        if (user != null){
            user.setPassword("***********"); // Fica apenas gravado na memória, não altera o BD
            return ResponseEntity.ok(user); // ok = 200
        }
        return ResponseEntity.notFound().build(); // 404 = not found
    }

    @PostMapping("/new")
    public ResponseEntity<User> novoUsuario(@RequestBody User user){
        User newUser = dao.save(user);

        return ResponseEntity.ok(newUser);
    }

    @PostMapping("/email")
    public ResponseEntity<UserDTO> buscaPorEmail(@RequestBody User user){
        User userFinded = dao.findByEmail(user.getEmail());

        if(userFinded != null){
            UserDTO userDTO = new UserDTO(userFinded);
            return ResponseEntity.ok(userDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/loginemail")
    public ResponseEntity<UserDTO> loginPorEmail(@RequestBody User user){
        User userFinded = dao.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if(userFinded != null){
            UserDTO userDTO = new UserDTO(userFinded);
            return ResponseEntity.ok(userDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestBody User user){
        User userFinded = dao.findByEmailOrCpf(user.getEmail(), user.getCpf());
        
        if(userFinded != null){
            if(user.getPassword().equals(userFinded.getPassword())){
                UserDTO userDTO = new UserDTO(userFinded);
                return ResponseEntity.ok(userDTO);
            }
            //return ResponseEntity.status(401).build(); - não é necessário, fica duplicado;
        }
        return ResponseEntity.status(401).build();
    }
    
    @GetMapping("/id2/{id}")
    public ResponseEntity<User> buscarPersonalizado(@PathVariable int id){
        User userFinded = dao.buscaPorId(id);

        if (userFinded != null){
            return ResponseEntity.ok(userFinded);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/id3/{id}") // Neste caso, por ser nativo no banco não vem em JSON formatado, vem apenas as informações do banco
    public ResponseEntity<Object> buscarUserPersonalizado(@PathVariable int id){
        Object userFinded = dao.buscarUsuariosPorId(id);

        if (userFinded != null){
            return ResponseEntity.ok(userFinded);
        }
        return ResponseEntity.notFound().build();
    }
}
