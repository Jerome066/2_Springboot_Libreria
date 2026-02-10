package com.libreria.parte1.library_service.dto;

import lombok.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class userDTO {
    @NotBlank(message = "Username is mandatory")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    private String username;

    @NotBlank(message = "Password is mandatory")
    private String password;
}
