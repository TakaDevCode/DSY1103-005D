package com.duoc.DSY1103.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "atencion")
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "fecha_atencion", nullable = false)
    private LocalDate fechaAtencion;

    @Column(name = "hora_atencion", nullable = false)
    private LocalDate horaAtencion;

    @Column(name = "costo", nullable = false)
    private Integer costo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_paciente", nullable = false)
    private Paciente idPaciente;


}