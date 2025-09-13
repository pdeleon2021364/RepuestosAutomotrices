package com.pdeleon.repuestos.service;

import com.pdeleon.repuestos.model.Proveedor;
import java.util.List;

public interface ProveedorService {
    List<Proveedor> getAllProveedores();
    Proveedor getProveedorById(String id);
    Proveedor saveProveedor(Proveedor proveedor);
    Proveedor updateProveedor(String id, Proveedor proveedor);
    void deleteProveedor(String id);
}
