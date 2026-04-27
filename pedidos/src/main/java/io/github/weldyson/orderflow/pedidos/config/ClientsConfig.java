package io.github.weldyson.orderflow.pedidos.config;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "io.github.weldyson.orderflow.pedidos.client")
public class ClientsConfig {


}
