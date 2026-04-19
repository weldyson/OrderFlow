package io.github.weldyson.orderflow.pedidos.controller.mappers;


import io.github.weldyson.orderflow.pedidos.controller.dto.ItemPedidoDTO;
import io.github.weldyson.orderflow.pedidos.model.ItemPedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemPedidoMapper {
    ItemPedido map(ItemPedidoDTO dto);
}
