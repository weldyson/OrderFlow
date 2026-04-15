package io.github.weldyson.orderflow.clientes.controller;

import io.github.weldyson.orderflow.clientes.model.Cliente;
import io.github.weldyson.orderflow.clientes.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
        service.salvar(cliente);
        return ResponseEntity.ok(cliente);
    }
    @GetMapping("{codigo}")
    public ResponseEntity<Cliente> obterPorCodigo(@PathVariable("codigo") Long codigo){
        return service
                .obterPorCodigo(codigo)
                .map(ResponseEntity::ok)
                .orElseGet( () -> ResponseEntity.notFound().build());
    }
}
