package br.com.fiap.plusoft.AgroCareTech.servico;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.fiap.plusoft.AgroCareTech.agropecuarista.Agropecuarista;
import br.com.fiap.plusoft.AgroCareTech.animal.Animal;
import br.com.fiap.plusoft.AgroCareTech.veterinario.Veterinario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
    private LocalDate dataServico;

    @NotNull(message = "{servico.precoServico.notnull}")
    @Positive(message = "{servico.precoServico.positive}")
    private BigDecimal precoServico;

    @NotBlank(message = "{servico.diagnostico.notblank}")
    private String diagnostico;
    
    @ManyToOne
    private Agropecuarista agropecuarista;

    @ManyToOne
    private Animal animal;

    @ManyToOne
    private Veterinario veterinario;
}
