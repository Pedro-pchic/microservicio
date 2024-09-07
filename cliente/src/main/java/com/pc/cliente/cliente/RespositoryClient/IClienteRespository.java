package com.pc.cliente.cliente.RespositoryClient;

import com.pc.cliente.cliente.Entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IClienteRespository extends MongoRepository<Cliente, String> {
}
