package com.pc.cliente.cliente.ClienteService;

import com.pc.cliente.cliente.Entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<Cliente> obtenerTodoLosClientes();
    Optional<Cliente> obtenerClientePorId(String id);
    Cliente guardarCliente(Cliente cliente);
    void elimanarCliente(String id);
}
