package br.com.fiap.plusoft.AgroCareTech.domain.veterinario;


import br.com.fiap.plusoft.AgroCareTech.domain.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "t_agrocare_veterinario")
public class Veterinario{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String phoneNumber;
    String email;
    String password;
    String avatar;
    String role;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    String especializacaoVeterinario;
    String cmrv;
        
}
