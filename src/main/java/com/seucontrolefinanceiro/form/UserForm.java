package com.seucontrolefinanceiro.form;

import com.seucontrolefinanceiro.domain.User;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class UserForm {
    private final String id;
    @NonNull
    private final String fullName;
    @NonNull
    private final String email;
    @NonNull
    private final String password;
    @NonNull
    private final String cpf;

    public User converter() {
        return User.builder()
                .id(this.id)
                .fullName(this.fullName)
                .email(this.email)
                .password(this.password)
                .cpf(this.cpf)
                .build();
    }
}