package br.com.fiap.plusoft.AgroCareTech.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_agrocare_users")
@Data
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "{agropecuarista.nome.notnull}")
    private String name;

    @NotNull(message = "{agropecuarista.email.notnull}")
    private String email;

    @NotNull(message = "{agropecuarista.senha.notnull}")
    @Size(min = 6, max = 30, message = "{agropecuarista.senha.size}")
    private String password;

    @NotBlank(message = "{agropecuarista.telefone.notblank}")
    private String phoneNumber;

    String avatar;
    String role;

    LocalDateTime createdAt;
    LocalDateTime updatedAt;

}
