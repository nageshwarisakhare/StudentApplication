package com.drc.assessment.StudentApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="teacher")
public class Teacher {

    @Email(message = "Email is not valid", regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
    @NotEmpty(message = "Email cannot be empty")
    @Id
    private String email;
    private String password;
    private String name;
    private String username;
    private String gender;

    @NotNull
    @Positive
    @Digits(fraction = 0, integer = 10, message ="add a digit msg")
    private int age;

}
