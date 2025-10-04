package com.neto.VirtualShop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos_tb")
public class Pedido {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private int quantidade;

    private double total;

    @ManyToOne
    private Cliente cliente;
}
