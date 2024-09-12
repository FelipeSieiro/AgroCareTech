package br.com.fiap.plusoft.AgroCareTech.veterinario;

import br.com.fiap.plusoft.AgroCareTech.user.User;
import jakarta.persistence.*;
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
    Long id;
    String especializacaoVeterinario;
    String cmrv;

    @OneToOne
    User user;
        
}
