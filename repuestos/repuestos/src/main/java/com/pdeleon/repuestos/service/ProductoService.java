package com.pdeleon.repuestos.service;

import com.pdeleon.repuestos.model.Producto;
import java.util.List;

public interface ProductoService {
    List<Producto> getAllProductos();
    Producto getProductoById(String id);
    Producto saveProducto(Producto producto);
    Producto updateProducto(String id, Producto producto);
    void deleteProducto(String id);
}
