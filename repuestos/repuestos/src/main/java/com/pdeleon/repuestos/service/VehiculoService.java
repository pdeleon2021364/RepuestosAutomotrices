package com.pdeleon.repuestos.service;

import com.pdeleon.repuestos.model.Vehiculo;
import java.util.List;

public interface VehiculoService {
    List<Vehiculo> getAllVehiculos();
    Vehiculo getVehiculoById(String id);
    Vehiculo saveVehiculo(Vehiculo vehiculo);
    Vehiculo updateVehiculo(String id, Vehiculo vehiculo);
    void deleteVehiculo(String id);
}
