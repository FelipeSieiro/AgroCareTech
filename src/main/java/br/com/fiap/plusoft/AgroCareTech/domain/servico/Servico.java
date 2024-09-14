package br.com.fiap.plusoft.AgroCareTech.domain.servico;



import br.com.fiap.plusoft.AgroCareTech.domain.agropecuarista.Agropecuarista;
import br.com.fiap.plusoft.AgroCareTech.domain.animal.Animal;
import br.com.fiap.plusoft.AgroCareTech.domain.veterinario.Veterinario;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "t_agrocare_servico")
public class Servico {
    
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dataServico;
    private BigDecimal precoServico;
    private String diagnostico;
    
    @ManyToOne
    private Agropecuarista agropecuarista;

    @ManyToOne
    private Animal animal;

    @ManyToOne
    private Veterinario veterinario;
}
