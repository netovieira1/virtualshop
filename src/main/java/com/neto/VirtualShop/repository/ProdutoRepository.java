package com.neto.VirtualShop.repository;

import com.neto.VirtualShop.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
