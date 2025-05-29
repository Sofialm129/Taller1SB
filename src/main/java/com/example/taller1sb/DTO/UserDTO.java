package com.example.taller1sb.DTO;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private int id;
    @NotEmpty(message = "Se requiere nombre de usuario")
    private String username;
    private String email;
    @NotEmpty(message = "Se requiere contraseña")
    private String password;
}
