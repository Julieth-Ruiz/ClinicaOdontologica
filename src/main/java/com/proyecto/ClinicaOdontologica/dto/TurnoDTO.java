package com.proyecto.ClinicaOdontologica.dto;

import com.proyecto.ClinicaOdontologica.model.Odontologo;
import com.proyecto.ClinicaOdontologica.model.Paciente;

import java.time.LocalDateTime;

public class TurnoDTO {
    private Integer id;
    private Paciente paciente;
    private Odontologo odontologo;
    private LocalDateTime fechaHora;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
