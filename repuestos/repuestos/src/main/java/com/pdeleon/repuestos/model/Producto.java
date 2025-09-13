package com.pdeleon.repuestos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Productos")
public class Producto {

    @Id
    @Column(name = "id_producto", length = 50)
    private String idProducto;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "precio_venta", length = 50)
    private String precioVenta;

    public String getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }
}
