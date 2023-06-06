package com.drc.assessment.StudentApplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int rollNo;

    private String name;

    private String department;

    private String standard;

    private String gender;

    @NotNull
    @Positive
    @Digits(fraction = 0, integer = 10, message ="add a digit msg")
    private int age;

}
