package com.it4us.todoapp.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
public class UserCreateDto {

    @Size(min = 1)
    private String userName;

    @Email
    private String email;

    @Size(min = 8)
    private String password;

}
