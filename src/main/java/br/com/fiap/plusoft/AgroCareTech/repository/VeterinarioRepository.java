package br.com.fiap.plusoft.AgroCareTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.plusoft.AgroCareTech.model.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long>{
    
}
