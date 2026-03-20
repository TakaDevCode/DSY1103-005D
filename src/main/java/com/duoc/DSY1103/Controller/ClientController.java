package com.duoc.DSY1103.Controller;

import com.duoc.DSY1103.Service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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



/*

    @GetMapping("/{id}")
    public Cliente getClientById(@PathVariable int id){
        return clientService.obtenerClienteSegunID(id);
    }
*/

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClientById(@PathVariable int id){
        Cliente cliente = clientService.obtenerClienteSegunID(id);
        if(cliente!=null){
            return ResponseEntity.ok().body(cliente);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/")
    public void agregarCliente(@RequestBody Cliente cliente){
        clientService.agregarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarCliente(@PathVariable int id){
        boolean res =  clientService.eliminarCliente(id);
        if(res){
            return ResponseEntity.ok().body("Eliminado correctamente");
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> actualizarCliente(@PathVariable int id, @RequestBody Cliente nuevo){
        Cliente cliente = clientService.obtenerClienteSegunID(id);
        if(cliente!=null){
            clientService.actualizarCLiente(nuevo);
            return ResponseEntity.ok().body(cliente);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
