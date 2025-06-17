package com.vignesh.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailDetails {
    @NotBlank(message = "Recipient name is required")
    private String name;
    @Email(message = "Invalid email format")
    private String email;
    @NotBlank(message = "Message is required")
    @Size(min = 10, max = 500, message = "Message must be between 10 and 500 characters")
    private String message;
}
