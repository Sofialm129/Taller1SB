package model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private int id;
    @NotEmpty(message = "Se requiere nombre de usuario")
    private String username;
    private String email;
    @NotEmpty(message = "Se requiere contraseña")
    private String password;

}
