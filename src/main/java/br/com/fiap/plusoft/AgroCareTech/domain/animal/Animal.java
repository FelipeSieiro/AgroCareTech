package br.com.fiap.plusoft.AgroCareTech.domain.animal;



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
@Table(name = "t_agrocare_animals")
public class Animal {
    
         @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String especie;
        private Integer idade;
        private Double peso;
        private String urlImage;
        @ManyToOne
        private User user;
}

