package br.com.fiap.plusoft.AgroCareTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.plusoft.AgroCareTech.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    
}