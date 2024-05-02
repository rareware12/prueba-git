package com.example.api_crud.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
public class UserModel {

    @Id @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column @Getter @Setter
    private String firstName;

    @Column @Getter @Setter
    private String lastName;

    @Column @Getter @Setter
    private String email;




}
