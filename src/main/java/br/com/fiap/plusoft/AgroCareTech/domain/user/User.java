package br.com.fiap.plusoft.AgroCareTech.domain.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_agrocare_users")
@Data
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String phoneNumber;
    String email;

    @Size(min = 6, max = 30)
    String password;

    String avatar;
    String role;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

}
