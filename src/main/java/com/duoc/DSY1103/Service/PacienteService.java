package com.duoc.DSY1103.Service;

import com.duoc.DSY1103.Model.Paciente;
import com.duoc.DSY1103.Repository.PacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepo pacienteRepo;

    public boolean agregar(Paciente paciente)
    {
        return pacienteRepo.save(paciente) != null;
    }

    public Paciente buscarporId(int id){
        return pacienteRepo.findById(id).get();
    }
    public List<Paciente> buscarTodos(){
        return  pacienteRepo.findAll();
    }
}
