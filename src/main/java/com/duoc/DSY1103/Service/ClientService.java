package com.duoc.DSY1103.Service;

import com.duoc.DSY1103.Model.Cliente;
import com.duoc.DSY1103.Repository.ClientRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientRepo clientRepo = new ClientRepo();

    public List<Cliente> getAllClientes() {
        return clientRepo.ObtenerClientes();
    }
    public void agregarCliente(Cliente cliente ){
        clientRepo.agregar(cliente);
    }

    public Cliente obtenerClienteSegunID(int id){
        return clientRepo.obtenerClienteSegunID(id);
    }
}
