package io.github.weldyson.orderflow.pedidos.service;



import io.github.weldyson.orderflow.pedidos.client.ServicoBancarioClient;
import io.github.weldyson.orderflow.pedidos.model.Pedido;
import io.github.weldyson.orderflow.pedidos.repository.ItemPedidoRepository;
import io.github.weldyson.orderflow.pedidos.repository.PedidoRepository;
import io.github.weldyson.orderflow.pedidos.validator.PedidoValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PedidoService {

    private final PedidoRepository repository;
    private final ItemPedidoRepository itemPedidoRepository;
    private final PedidoValidator validator;
    private final ServicoBancarioClient servicoBancarioClient;


    @Transactional
    public Pedido criarPedido(Pedido pedido) {
        validator.validar(pedido);
        realizarPersistencia(pedido);
        enviarSolicitacaoPagamento(pedido);

        return pedido;
    }

    private void enviarSolicitacaoPagamento(Pedido pedido) {
        var chavePagamento = servicoBancarioClient.solicitarPagamento(pedido);
        pedido.setChavePagamento(chavePagamento);
    }

    private void realizarPersistencia(Pedido pedido) {
        repository.save(pedido);
        itemPedidoRepository.saveAll(pedido.getItens());
    }

}
