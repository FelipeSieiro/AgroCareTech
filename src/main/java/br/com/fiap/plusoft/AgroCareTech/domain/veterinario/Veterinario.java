package br.com.fiap.plusoft.AgroCareTech.domain.veterinario;


import br.com.fiap.plusoft.AgroCareTech.domain.user.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_agrocare_veterinario")
public class Veterinario{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String especializacaoVeterinario;
    String cmrv;

    @OneToOne
    User user;
        
}
