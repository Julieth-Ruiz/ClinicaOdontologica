package com.proyecto.ClinicaOdontologica.service;

import com.proyecto.ClinicaOdontologica.dto.PacienteDTO;

import java.util.Set;

public interface IPacienteService{

    void agregar(PacienteDTO paciente);
    PacienteDTO buscar(Integer id);
    void modificar(PacienteDTO paciente);
    void eliminar (Integer id);
    Set<PacienteDTO> listar();

}
