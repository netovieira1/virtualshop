package com.neto.VirtualShop.repository;

import com.neto.VirtualShop.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
