package com.pc.factura.ClienteFeign;


import com.pc.cliente.cliente.Entity.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cliente-service", url = "http://localhost:8081/api/clientes")
public interface ClienteFeignClient {
    @GetMapping("/{id}")
    Cliente obtenerClientePorId(@PathVariable("id") String id);
}
