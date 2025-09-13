package com.pdeleon.repuestos.service;

import com.pdeleon.repuestos.model.Vehiculo;
import com.pdeleon.repuestos.repository.VehiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    private final VehiculoRepository vehiculoRepository;

    public VehiculoServiceImpl(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    @Override
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo getVehiculoById(String id) {
        return vehiculoRepository.findById(id).orElse(null);
    }

    @Override
    public Vehiculo saveVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Override
    public Vehiculo updateVehiculo(String id, Vehiculo vehiculo) {
        Vehiculo existingVehiculo = vehiculoRepository.findById(id).orElse(null);
        if (existingVehiculo != null) {
            existingVehiculo.setMarca(vehiculo.getMarca());
            existingVehiculo.setModelo(vehiculo.getModelo());
            existingVehiculo.setAnio(vehiculo.getAnio());
            return vehiculoRepository.save(existingVehiculo);
        }
        return null;
    }

    @Override
    public void deleteVehiculo(String id) {
        vehiculoRepository.deleteById(id);
    }
}
