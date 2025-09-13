package com.pdeleon.repuestos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Clientes")
public class Cliente {

    @Id
    @Column(name = "id_cliente", length = 50)
    private String idCliente;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "direccion", length = 255)
    private String direccion;

    @Column(name = "telefono", length = 20)
    private String telefono;

    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
