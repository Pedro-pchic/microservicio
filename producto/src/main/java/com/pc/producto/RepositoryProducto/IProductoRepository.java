package com.pc.producto.RepositoryProducto;

import com.pc.producto.models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductoRepository extends MongoRepository<Producto, String> {
}
