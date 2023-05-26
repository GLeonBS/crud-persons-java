package com.user.cruduser.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 150 ,nullable = false)
    private String nome;
    @Column(length = 11, nullable = false)
    private String telefone;
    @Column(length = 150, nullable = false)
    private String email;
}
