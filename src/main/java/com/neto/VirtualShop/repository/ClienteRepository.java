package com.neto.VirtualShop.repository;

import com.neto.VirtualShop.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
