package com.pdeleon.repuestos.controller;

import com.pdeleon.repuestos.model.Producto;
import com.pdeleon.repuestos.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> getAllProductos(){
        return productoService.getAllProductos();
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);
    }

    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable String id){
        return productoService.getProductoById(id);
    }

    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable String id, @RequestBody Producto producto){
        return productoService.updateProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable String id){
        productoService.deleteProducto(id);
    }
}
