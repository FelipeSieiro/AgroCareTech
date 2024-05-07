package br.com.fiap.plusoft.AgroCareTech.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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

    @NotNull(message = "{servico.dataServico.notnull}")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataServico;

    @NotNull(message = "{servico.precoServico.notnull}")
    @Positive(message = "{servico.precoServico.positive}")
    private BigDecimal precoServico;

    @NotBlank(message = "{servico.diagnostico.notblank}")
    private String diagnostico;

    @NotBlank(message = "{servico.nomeAnimal.notblank}")
    private String nomeAnimal;

    @NotBlank(message = "{servico.nomeAgropecuarista.notblank}")
    private String nomeAgropecuarista;
    
}
