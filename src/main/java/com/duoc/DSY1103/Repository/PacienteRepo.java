package com.duoc.DSY1103.Repository;

import com.duoc.DSY1103.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepo extends JpaRepository<Paciente, Integer>
{
}
