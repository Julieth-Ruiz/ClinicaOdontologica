package com.proyecto.ClinicaOdontologica.dto;

//import com.proyecto.ClinicaOdontologica.model.Domicilio;

import java.util.Date;

public class PacienteDTO {
    private Integer id;
    private String nombre;
    private String apellido;
//    private Domicilio domicilio;
    private Integer dni;
    private Date fechaAlta;

    public PacienteDTO() {
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

//    public Domicilio getDomicilio() {
//        return domicilio;
//    }
//
//    public void setDomicilio(Domicilio domicilio) {
////        this.domicilio = domicilio;
//    }

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
}
