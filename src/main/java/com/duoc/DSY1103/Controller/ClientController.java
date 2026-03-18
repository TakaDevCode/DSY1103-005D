package com.duoc.DSY1103.Controller;

import com.duoc.DSY1103.Service.ClientService;
import org.springframework.web.bind.annotation.*;
import com.duoc.DSY1103.Model.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private ClientService clientService = new ClientService();

    @GetMapping("")
    public List<Cliente> getAllClients(){
        return clientService.getAllClientes();
    }

    @GetMapping("/{id}")
    public Cliente getClientById(@PathVariable int id){
        return clientService.obtenerClienteSegunID(id);
    }

    @PostMapping("/")
    public void agregarCliente(@RequestBody Cliente cliente){
        clientService.agregarCliente(cliente);
    }

}
