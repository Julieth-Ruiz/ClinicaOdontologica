package com.proyecto.ClinicaOdontologica.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.*;

@Entity
@Table( name = "Pacientes")

public class Paciente {

    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private Integer id;

    private String nombre;
    private String apellido;

    @OneToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL )
    @JoinColumn(name = "domicilio_id", nullable = false)
    private Domicilio domicilio;

    private Integer dni;
    private Date fechaAlta;

    @OneToMany(mappedBy ="paciente" )
    @JsonIgnore
    private Set<Turno> Turnos;

    public Paciente() {
    }


    public Paciente(String nombre, String apellido, Domicilio domicilio, Integer dni, Date fechaAlta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
    }

    public Paciente(Integer id, String nombre, String apellido, Domicilio domicilio, Integer dni, Date fechaAlta, Set<Turno> turnos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
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

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Set<Turno> getTurnos() {
        return Turnos;
    }

    public void setTurnos(Set<Turno> turnos) {
        Turnos = turnos;
    }
}
