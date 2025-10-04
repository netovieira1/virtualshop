package com.neto.VirtualShop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "produtos_tb")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String descricao;

    private double preco;

    private int quantidade;

    @Column(unique = true)
    private String barcode;
}
