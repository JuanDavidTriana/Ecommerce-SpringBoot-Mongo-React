package com.project.backend.dto;

public class LoginRequest {
    private String email;
    private String password;

    // Constructor vacío (opcional)
    public LoginRequest() {}

    // Getters y Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
