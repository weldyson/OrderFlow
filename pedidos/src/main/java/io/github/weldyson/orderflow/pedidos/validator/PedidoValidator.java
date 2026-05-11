package io.github.weldyson.orderflow.pedidos.validator;


import io.github.weldyson.orderflow.pedidos.client.ClientesClient;
import io.github.weldyson.orderflow.pedidos.client.ProdutosClient;
import io.github.weldyson.orderflow.pedidos.client.representation.ProdutoRepresentation;
import io.github.weldyson.orderflow.pedidos.model.ItemPedido;
import io.github.weldyson.orderflow.pedidos.model.Pedido;
import io.github.weldyson.orderflow.pedidos.repository.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PedidoValidator {

    private final ProdutosClient produtosClient;
    private final ClientesClient clientesClient;

    public void validar(Pedido pedido) {
        Long codigoCliente = pedido.getCodigoCliente();
        validarCliente(codigoCliente);
        pedido.getItens().forEach(this::validarItem);
    }

    private void validarCliente(Long codigoCliente) {

    }

    private void validarItem(ItemPedido produto) {

    }

}
