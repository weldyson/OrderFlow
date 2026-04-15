package io.github.weldyson.orderflow.clientes.repository;

import io.github.weldyson.orderflow.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
