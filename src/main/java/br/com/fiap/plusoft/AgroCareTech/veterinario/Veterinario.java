package br.com.fiap.plusoft.AgroCareTech.domain.veterinario;

import br.com.fiap.plusoft.AgroCareTech.domain.user.User;
import jakarta.persistence.Entity;
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
public class Veterinario  extends User {

    @NotNull(message = "{veterinario.especializacaoVeterinario.notnull}")
    private String especializacao;

    @NotNull(message = "{veterinario.cmrv.notnull}")
    private String cmrv;
        
}
