package com.proyecto.ClinicaOdontologica.dto;

import com.proyecto.ClinicaOdontologica.model.Odontologo;
import com.proyecto.ClinicaOdontologica.model.Paciente;

import java.time.LocalDateTime;

public class TurnoDTO {
    public Integer id;
    public Paciente paciente;
    public Odontologo odontologo;
    public LocalDateTime fechaHora;

}
