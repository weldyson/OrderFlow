package io.github.weldyson.orderflow.pedidos.controller;


import io.github.weldyson.orderflow.pedidos.controller.DTO.NovoPedidoDTO;
import io.github.weldyson.orderflow.pedidos.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedidos")
@RequiredArgsConstructor
public class PedidoController {


    private final PedidoService service;

    public ResponseEntity criar(@RequestBody NovoPedidoDTO dto) {
        return null;
    }
}
