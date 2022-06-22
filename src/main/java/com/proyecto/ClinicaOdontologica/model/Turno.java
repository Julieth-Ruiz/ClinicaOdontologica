package com.proyecto.ClinicaOdontologica.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Turno {

    @Id
    @GeneratedValue
    public Integer id;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    public Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "odontologo_id", nullable = false)
    public Odontologo odontologo;

    public LocalDateTime fechaHora;
}
