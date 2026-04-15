package io.github.weldyson.orderflow.produtos.service;


import io.github.weldyson.orderflow.produtos.model.Produto;
import io.github.weldyson.orderflow.produtos.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public Produto salvar (Produto produto) {
        return repository.save(produto);
    }

    public Optional<Produto> obterPorCodigo(Long codigo){
        return repository.findById(codigo);
    }

}
