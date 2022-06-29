package com.proyecto.ClinicaOdontologica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;

@Entity
@Table( name = "Odontologos")
public class Odontologo {

    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;
    private String apellido;
    private Long matricula;

    @OneToMany(mappedBy ="odontologo", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Turno> Turnos;

    public Odontologo() {
    }

    public Odontologo(String nombre, String apellido, Long matricula, Set<Turno> turnos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        Turnos = turnos;
    }

    public Odontologo(Integer id, String nombre, String apellido, Long matricula, Set<Turno> turnos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        Turnos = turnos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Set<Turno> getTurnos() {
        return Turnos;
    }

    public void setTurnos(Set<Turno> turnos) {
        Turnos = turnos;
    }
}
