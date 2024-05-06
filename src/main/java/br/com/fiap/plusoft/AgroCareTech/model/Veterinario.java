package br.com.fiap.plusoft.AgroCareTech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Veterinario {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String nomeVeterinario;
    
    @NotNull
    private String especializacaoVeterinario;
    
    @NotBlank
    private String telefoneVeterinario;

    @NotNull
    private String emailVeterinario;
    
    @NotNull
    private String senhaVeterinario;

    @NotNull
    private String cmrv;
    

    

    
}
