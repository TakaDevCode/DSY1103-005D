package com.duoc.DSY1103.Repository;

import com.duoc.DSY1103.Model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepo {
    private List<Cliente> clientes = new ArrayList<>();

    public ClientRepo() {
        // Agregar algunos clientes de ejemplo
        clientes.add(new Cliente(1, "Juan Perez", "correo@correo.cl"));
        clientes.add(new Cliente(2, "Maria Gomez", "correo@mail.com"));
        clientes.add(new Cliente(3,"Carlos Sanchez","mail@duoc.cl"));
    }

    public List<Cliente> ObtenerClientes() {
        return clientes;
    }

    public void agregar(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente obtenerClienteSegunID(int id) {
        for (Cliente temp : clientes) {
            if (temp.getId() == id) {
                return temp;
            }
        }
        return null;
    }

    public void actualizar(Cliente updatedCliente) {
        for (Cliente temp : clientes) {
            if (temp.getId() == updatedCliente.getId()) {
                temp.setNombre(updatedCliente.getNombre());
                temp.setEmail(updatedCliente.getEmail());
                break;
            }
        }
    }

    public void eliminar(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes.remove(cliente);
                break;
            }
        }
    }
}


