package io.github.weldyson.orderflow.pedidos.controller.mappers;

import io.github.weldyson.orderflow.pedidos.controller.dto.NovoPedidoDTO;
import io.github.weldyson.orderflow.pedidos.model.Pedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PedidoMapper {
    Pedido map(NovoPedidoDTO dto);
}
