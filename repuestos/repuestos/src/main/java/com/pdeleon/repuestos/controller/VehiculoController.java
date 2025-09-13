package com.pdeleon.repuestos.controller;

import com.pdeleon.repuestos.model.Vehiculo;
import com.pdeleon.repuestos.service.VehiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {
    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService){
        this.vehiculoService = vehiculoService;
    }

    // Obtener todos los vehículos
    @GetMapping
    public List<Vehiculo> getAllVehiculos(){
        return vehiculoService.getAllVehiculos();
    }

    // Crear nuevo vehículo
    @PostMapping
    public Vehiculo createVehiculo(@RequestBody Vehiculo vehiculo){
        return vehiculoService.saveVehiculo(vehiculo);
    }

    // Obtener vehículo por ID
    @GetMapping("/{id}")
    public Vehiculo getVehiculoById(@PathVariable String id){
        return vehiculoService.getVehiculoById(id);
    }

    // Actualizar vehículo
    @PutMapping("/{id}")
    public Vehiculo updateVehiculo(@PathVariable String id, @RequestBody Vehiculo vehiculo){
        return vehiculoService.updateVehiculo(id, vehiculo);
    }

    // Eliminar vehículo
    @DeleteMapping("/{id}")
    public void deleteVehiculo(@PathVariable String id){
        vehiculoService.deleteVehiculo(id);
    }
}
