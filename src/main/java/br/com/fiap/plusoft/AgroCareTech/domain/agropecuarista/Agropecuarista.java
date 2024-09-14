package br.com.fiap.plusoft.AgroCareTech.domain.agropecuarista;


import br.com.fiap.plusoft.AgroCareTech.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_agrocare_agropecuarista")
public class Agropecuarista {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    User user;
    
}
