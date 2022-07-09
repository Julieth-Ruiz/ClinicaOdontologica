package com.proyecto.ClinicaOdontologica.service;

import com.proyecto.ClinicaOdontologica.dto.PacienteDTO;
import com.proyecto.ClinicaOdontologica.model.Paciente;

import java.util.List;
import java.util.Set;

public interface IPacienteService{

    void agregar(Paciente paciente);
    Paciente buscar(Integer id);
    void modificar( Paciente paciente);
    void eliminar (Integer id);
    List<Paciente> listar();

}
