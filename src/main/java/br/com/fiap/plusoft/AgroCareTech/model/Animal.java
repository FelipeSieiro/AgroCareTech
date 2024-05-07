package br.com.fiap.plusoft.AgroCareTech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
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
public class Animal {
    
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "{animal.nome.notblank}")
    private String nomeAnimal;

    @NotBlank(message = "{animal.especie.notblank}")
    private String especieAnimal;

    @Positive(message = "{animal.idade.positive}")
    private Integer idadeAnimal;

    @Positive(message = "{animal.peso.positive}")
    private Integer pesoAnimal;

    @ManyToOne
    private Agropecuarista agropecuarista;
}

