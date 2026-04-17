package io.github.weldyson.orderflow.pedidos.controller.dto;

import io.github.weldyson.orderflow.pedidos.model.enums.TipoPagamento;

public record DadosPagamentoDTO(String dados, TipoPagamento tipoPagamento) {
}
