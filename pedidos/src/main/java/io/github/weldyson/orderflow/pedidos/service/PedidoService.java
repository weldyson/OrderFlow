package io.github.weldyson.orderflow.pedidos.service;


import io.github.weldyson.orderflow.pedidos.repository.ItemPedidoRepository;
import io.github.weldyson.orderflow.pedidos.repository.PedidoRepository;
import io.github.weldyson.orderflow.pedidos.validator.PedidoValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository repository;
    private final ItemPedidoRepository itemPedidoRepository;
    private final PedidoValidator validator;

}
