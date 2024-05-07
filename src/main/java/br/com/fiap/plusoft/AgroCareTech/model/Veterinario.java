package br.com.fiap.plusoft.AgroCareTech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotNull(message = "{veterinario.nomeVeterinario.notnull}")
    private String nomeVeterinario;

    @NotNull(message = "{veterinario.especializacaoVeterinario.notnull}")
    private String especializacaoVeterinario;

    @NotBlank(message = "{veterinario.telefoneVeterinario.notblank}")
    private String telefoneVeterinario;

    @NotNull(message = "{veterinario.emailVeterinario.notnull}")
    private String emailVeterinario;

    @NotNull(message = "{veterinario.senhaVeterinario.notnull}")
    @Size(min = 6, max = 30, message = "{veterinario.senha.size}")
    private String senhaVeterinario;

    @NotNull(message = "{veterinario.cmrv.notnull}")
    private String cmrv;
        
}
