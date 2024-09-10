package br.com.fiap.plusoft.AgroCareTech.animal;

import br.com.fiap.plusoft.AgroCareTech.agropecuarista.Agropecuarista;
import jakarta.persistence.*;
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
@Table(name = "animals")
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
    private Double pesoAnimal;

    private String urlImageAnimal;

    @ManyToOne
    private Agropecuarista agropecuarista;
}

