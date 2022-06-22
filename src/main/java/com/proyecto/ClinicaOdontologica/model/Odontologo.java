package com.proyecto.ClinicaOdontologica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Odontologo {

    @Id
    @GeneratedValue
    private Integer id;

    public String nombre;
    public String apellido;
    public Long matricula;

    @OneToMany(mappedBy ="odontologo")
    @JsonIgnore
    private Set<Turno> Turnos;

}
