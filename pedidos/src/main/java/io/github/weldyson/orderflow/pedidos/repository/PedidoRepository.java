package io.github.weldyson.orderflow.pedidos.repository;

import io.github.weldyson.orderflow.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
