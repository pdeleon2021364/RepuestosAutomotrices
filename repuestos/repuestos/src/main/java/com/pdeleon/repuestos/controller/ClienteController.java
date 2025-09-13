package com.pdeleon.repuestos.controller;

import com.pdeleon.repuestos.model.Cliente;
import com.pdeleon.repuestos.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> getAllClientes(){
        return clienteService.getAllClientes();
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteService.saveCliente(cliente);
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable String id){
        return clienteService.getClienteById(id);
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable String id, @RequestBody Cliente cliente){
        return clienteService.updateCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable String id){
        clienteService.deleteCliente(id);
    }
}
