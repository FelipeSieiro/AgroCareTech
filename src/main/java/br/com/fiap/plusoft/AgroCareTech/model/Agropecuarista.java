package br.com.fiap.plusoft.AgroCareTech.model;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Agropecuarista {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String nomeAgropecuarista;
    
    @CPF
    private String cpfAgropecuarista;
    
    @NotNull
    private String emailAgropecuarista;

    @NotNull
    private String senhaAgropecuarista;
    
    @NotBlank
    private String telefoneAgropecuarista;

    

    
}
