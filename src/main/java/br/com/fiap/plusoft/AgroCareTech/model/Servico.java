package br.com.fiap.plusoft.AgroCareTech.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Servico {
    
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate dataServico;

    private BigDecimal precoServico;

    private String diagnostico;

    private String nomeAnimal;

    private String nomeAgropecuarista;
    
}
