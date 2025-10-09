package com.neto.VirtualShop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProdutoDto {

    private Long id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private String barcode;
}
