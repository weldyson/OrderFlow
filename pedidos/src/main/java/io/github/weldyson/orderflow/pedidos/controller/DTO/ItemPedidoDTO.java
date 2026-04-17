package io.github.weldyson.orderflow.pedidos.controller.dto;

import java.math.BigDecimal;

public record ItemPedidoDTO(Long codigoProduto, Integer quantidade, BigDecimal valorUnitario) {
}
