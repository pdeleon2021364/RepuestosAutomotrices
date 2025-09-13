DROP DATABASE IF EXISTS DBRepuestosAutomotrices;
CREATE DATABASE DBRepuestosAutomotrices;
USE DBRepuestosAutomotrices;

CREATE TABLE Clientes (
    id_cliente VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(255),
    telefono VARCHAR(20)
);
select * from Clientes;
CREATE TABLE Proveedores (
    id_proveedor VARCHAR(50) PRIMARY KEY,
    nombre_proveedor VARCHAR(100),
    contacto VARCHAR(100),
    telefono VARCHAR(20)
);
select * from Proveedores;
CREATE TABLE Productos (
    id_producto VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion VARCHAR(255),
    precio_venta VARCHAR(50)
);
select * from Productos;
CREATE TABLE Vehiculos (
    id_vehiculo VARCHAR(50) PRIMARY KEY,
    marca VARCHAR(100),
    modelo VARCHAR(100),
    anio VARCHAR(4)
);
select * from Vehiculos;