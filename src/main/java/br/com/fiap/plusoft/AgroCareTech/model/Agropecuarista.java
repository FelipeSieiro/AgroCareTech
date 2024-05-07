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
public class Agropecuarista {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "{agropecuarista.nome.notnull}")
    private String nomeAgropecuarista;

    @NotNull(message = "{agropecuarista.email.notnull}")
    private String emailAgropecuarista;

    @NotNull(message = "{agropecuarista.senha.notnull}")
    @Size(min = 6, max = 30, message = "{agropecuarista.senha.size}")
    private String senhaAgropecuarista;

    @NotBlank(message = "{agropecuarista.telefone.notblank}")
    private String telefoneAgropecuarista;
    
}
