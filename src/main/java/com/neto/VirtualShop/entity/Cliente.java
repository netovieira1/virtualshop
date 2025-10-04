package com.neto.VirtualShop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes_tb")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String telefone;

}
