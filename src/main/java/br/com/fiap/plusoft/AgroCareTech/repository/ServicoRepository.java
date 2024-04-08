package br.com.fiap.plusoft.AgroCareTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.plusoft.AgroCareTech.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}