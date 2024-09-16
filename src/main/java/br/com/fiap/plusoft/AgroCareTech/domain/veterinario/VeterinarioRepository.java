package br.com.fiap.plusoft.AgroCareTech.domain.veterinario;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long>{

    List<Veterinario> findByName(String name);
}
