package com.neto.VirtualShop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PedidoDto {

    private Long id;
    private int quantidade;
    double valorTotal;
    private Long clienteId;
}
