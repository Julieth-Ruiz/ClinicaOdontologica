package com.proyecto.ClinicaOdontologica.dto;

import com.proyecto.ClinicaOdontologica.model.Domicilio;

import java.util.Date;

public class PacienteDTO {
    public Integer id;
    public String nombre;
    public String apellido;
    public Domicilio domicilio;
    public Integer dni;
    public Date fechaAlta;
}
