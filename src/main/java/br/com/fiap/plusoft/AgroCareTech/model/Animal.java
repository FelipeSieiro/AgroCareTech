package br.com.fiap.plusoft.AgroCareTech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Animal {
    
     @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeAnimal;

    private String especieAnimal;

    private Integer idadeAnimal;

    private Integer pesoAnimal;

    @ManyToOne
    private Agropecuarista agropecuarista;
}

