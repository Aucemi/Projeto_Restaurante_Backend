package com.example.restaurante.repository;

import com.example.restaurante.model.Pedido;
import com.example.restaurante.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByMesaId(Long mesaId);
    List<Pedido> findByStatus(StatusPedido status);
}