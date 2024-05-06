package br.com.fiap.plusoft.AgroCareTech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.plusoft.AgroCareTech.model.Animal;
import br.com.fiap.plusoft.AgroCareTech.repository.AnimalRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("animal")
@Slf4j
public class AnimalController {

    @Autowired
    AnimalRepository repository;

    
    @GetMapping
    public List<Animal> index() {
        return repository.findAll();
    }
    
    @GetMapping("{id}")
    public ResponseEntity<Animal> buscarAnimal(@PathVariable Long id) {
        log.info("buscando animal por id {}", id);

        return repository
                .findById(id)
                .map(ResponseEntity::ok) 
                .orElse(ResponseEntity.notFound().build());
    }


    
}
