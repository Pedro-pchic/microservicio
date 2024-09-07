package com.pc.cliente.cliente.ClienteServiceImpl;

import com.pc.cliente.cliente.ClienteService.ClienteService;
import com.pc.cliente.cliente.Entity.Cliente;
import com.pc.cliente.cliente.RespositoryClient.IClienteRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private IClienteRespository clienteRespository;

    @Override
    public List<Cliente> obtenerTodoLosClientes() {
        return clienteRespository.findAll();
    }

    @Override
    public Optional<Cliente> obtenerClientePorId(String id) {
        return clienteRespository.findById(id);
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRespository.save(cliente);
    }

    @Override
    public void elimanarCliente(String id) {
        clienteRespository.deleteById(id);
    }

}
