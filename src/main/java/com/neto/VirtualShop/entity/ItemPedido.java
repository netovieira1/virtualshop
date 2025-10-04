package com.neto.VirtualShop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "itens_pedido_tb")
public class ItemPedido {

    private Long id;
    private int quantidade;
    private double precoUnitario;

    @ManyToOne
    private Pedido pedido;
}
