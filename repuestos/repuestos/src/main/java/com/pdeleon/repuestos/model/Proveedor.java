package com.pdeleon.repuestos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Proveedores")
public class Proveedor {

    @Id
    @Column(name = "id_proveedor", length = 50)
    private String idProveedor;

    @Column(name = "nombre_proveedor", length = 100)
    private String nombreProveedor;

    @Column(name = "contacto", length = 100)
    private String contacto;

    @Column(name = "telefono", length = 20)
    private String telefono;

    public String getIdProveedor() {
        return idProveedor;
    }
    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
