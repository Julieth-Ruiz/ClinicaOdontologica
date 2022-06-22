package com.proyecto.ClinicaOdontologica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.*;

@Entity
public class Paciente {

    @Id
    @GeneratedValue
    public Integer id;

    public String nombre;
    public String apellido;
    @OneToMany
    @JoinColumn(name = "domicilio_id", nullable = false)
    public Domicilio domicilio;

    public Integer dni;
    public Date fechaAlta;

    @OneToMany(mappedBy ="paciente")
    @JsonIgnore
    private Set<Turno> Turnos;
}
