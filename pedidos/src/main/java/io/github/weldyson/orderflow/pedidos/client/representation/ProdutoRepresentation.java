package io.github.weldyson.orderflow.pedidos.client.representation;

import java.math.BigDecimal;

public record ProdutoRepresentation(Long codigo, String nome, BigDecimal ValorUnitario)  {
}
