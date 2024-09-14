package br.com.fiap.plusoft.AgroCareTech.domain.animal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    
}