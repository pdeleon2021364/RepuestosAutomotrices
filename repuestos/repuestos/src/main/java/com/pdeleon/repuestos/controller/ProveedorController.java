package com.pdeleon.repuestos.controller;

import com.pdeleon.repuestos.model.Proveedor;
import com.pdeleon.repuestos.service.ProveedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {
    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService){
        this.proveedorService = proveedorService;
    }

    @GetMapping
    public List<Proveedor> getAllProveedores(){
        return proveedorService.getAllProveedores();
    }

    @PostMapping
    public Proveedor createProveedor(@RequestBody Proveedor proveedor){
        return proveedorService.saveProveedor(proveedor);
    }

    @GetMapping("/{id}")
    public Proveedor getProveedorById(@PathVariable String id){
        return proveedorService.getProveedorById(id);
    }

    @PutMapping("/{id}")
    public Proveedor updateProveedor(@PathVariable String id, @RequestBody Proveedor proveedor){
        return proveedorService.updateProveedor(id, proveedor);
    }

    @DeleteMapping("/{id}")
    public void deleteProveedor(@PathVariable String id){
        proveedorService.deleteProveedor(id);
    }
}
