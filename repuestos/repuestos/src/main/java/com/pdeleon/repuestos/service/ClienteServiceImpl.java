package com.pdeleon.repuestos.service;

import com.pdeleon.repuestos.model.Cliente;
import com.pdeleon.repuestos.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente getClienteById(String id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        if (clienteRepository.existsById(cliente.getIdCliente())) {
            throw new RuntimeException("El ID " + cliente.getIdCliente() + " ya está registrado. Intenta con otro.");
        }
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente updateCliente(String id, Cliente cliente) {
        Cliente existingCliente = clienteRepository.findById(id).orElse(null);
        if (existingCliente != null) {
            existingCliente.setNombre(cliente.getNombre());
            existingCliente.setDireccion(cliente.getDireccion());
            existingCliente.setTelefono(cliente.getTelefono());
            return clienteRepository.save(existingCliente);
        }
        return null;
    }

    @Override
    public void deleteCliente(String id) {
        clienteRepository.deleteById(id);
    }
}
