package io.github.weldyson.orderflow.clientes.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
/* create table clientes (
                          codigo serial not null primary key,
                          nome varchar(150) not null,
                          cpf char(11) not null,
                          logradouro varchar(100),
                          numero varchar(100),
                          bairro varchar(100),
                          email varchar(100),
                          telefone varchar(20)
); */
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;

    @Column(name = "logradouro", length = 100)
    private String logradouro;

    @Column(name = "numero", length = 100)
    private String numero;

    @Column(name = "bairro", length = 100)
    private String bairro;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "telefone", length = 20)
    private String telefone;
}
