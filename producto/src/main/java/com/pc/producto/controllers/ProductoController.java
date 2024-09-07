package com.pc.producto.controllers;


import com.pc.producto.InterfaceProductoService.ProductoService;
import com.pc.producto.ProductoServiceImpl.ProductoServiceImpl;
import com.pc.producto.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> obtenerProductos() {
        return productoService.obtenerProductos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProductosPorId(@PathVariable String id) {
        Optional<Producto> producto = productoService.obtenerProdcutoPorId(id);
        return producto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Cambiado a @PostMapping
    @PostMapping
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable String id, @RequestBody Producto productoActualizado) {
        Optional<Producto> producto = productoService.obtenerProdcutoPorId(id);
        if (producto.isPresent()) {
            productoActualizado.setId(id);
            return ResponseEntity.ok(productoService.guardarProducto(productoActualizado));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable String id) {
        productoService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }
}
