package com.pc.producto.ProductoServiceImpl;

import com.pc.producto.RepositoryProducto.IProductoRepository;
import com.pc.producto.models.Producto;
import com.pc.producto.InterfaceProductoService.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public List<Producto> obtenerProductos() {
       return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> obtenerProdcutoPorId(String id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(String id) {
        productoRepository.deleteById(id);
    }
}
