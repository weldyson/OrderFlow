package io.github.weldyson.orderflow.pedidos.repository;

import io.github.weldyson.orderflow.pedidos.model.ItemPedido;
import io.github.weldyson.orderflow.pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido,Long> {
}
