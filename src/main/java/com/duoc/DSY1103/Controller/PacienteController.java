package com.duoc.DSY1103.Controller;

import com.duoc.DSY1103.Model.Paciente;
import com.duoc.DSY1103.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/paciente")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping("")
    public ResponseEntity<List<Paciente>> buscarTodos() {
        List<Paciente> listado = pacienteService.buscarTodos();
        if (listado.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(listado, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscarPorId(@PathVariable Integer id) {
        Paciente buscado = pacienteService.buscarporId(id);
        if (buscado != null) {
            return new ResponseEntity<>(buscado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<Paciente> agregar(@RequestBody Paciente paciente) {
        boolean res = pacienteService.agregar(paciente);
        if (res) {
            return new ResponseEntity<>(paciente, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}

