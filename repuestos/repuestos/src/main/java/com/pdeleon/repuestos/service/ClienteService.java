package com.pdeleon.repuestos.service;

import com.pdeleon.repuestos.model.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> getAllClientes();
    Cliente getClienteById(String id);
    Cliente saveCliente(Cliente cliente);
    Cliente updateCliente(String id, Cliente cliente);
    void deleteCliente(String id);
}
