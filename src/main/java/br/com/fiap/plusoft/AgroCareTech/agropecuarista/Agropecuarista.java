package br.com.fiap.plusoft.AgroCareTech.agropecuarista;


import br.com.fiap.plusoft.AgroCareTech.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Agropecuarista extends User {

    @OneToOne
    User user;
}
