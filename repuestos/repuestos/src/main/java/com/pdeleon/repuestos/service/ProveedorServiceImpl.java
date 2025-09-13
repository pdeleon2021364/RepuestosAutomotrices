package com.pdeleon.repuestos.service;

import com.pdeleon.repuestos.model.Proveedor;
import com.pdeleon.repuestos.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorServiceImpl(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    public List<Proveedor> getAllProveedores() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor getProveedorById(String id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    @Override
    public Proveedor saveProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedor updateProveedor(String id, Proveedor proveedor) {
        Proveedor existingProveedor = proveedorRepository.findById(id).orElse(null);
        if (existingProveedor != null) {
            existingProveedor.setNombreProveedor(proveedor.getNombreProveedor());
            existingProveedor.setContacto(proveedor.getContacto());
            existingProveedor.setTelefono(proveedor.getTelefono());
            return proveedorRepository.save(existingProveedor);
        }
        return null;
    }

    @Override
    public void deleteProveedor(String id) {
        proveedorRepository.deleteById(id);
    }
}
