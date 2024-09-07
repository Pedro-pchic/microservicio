package com.pc.producto.InterfaceProductoService;

import com.pc.producto.models.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> obtenerProductos();
    Optional<Producto> obtenerProdcutoPorId(String id);
    Producto guardarProducto(Producto producto);
    void eliminarProducto(String id);

}
