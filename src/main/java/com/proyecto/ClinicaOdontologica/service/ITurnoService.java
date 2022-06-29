package com.proyecto.ClinicaOdontologica.service;

import com.proyecto.ClinicaOdontologica.dto.TurnoDTO;

import java.util.Set;

public interface ITurnoService {

    void agregar(TurnoDTO turno);
    Set<TurnoDTO> listar();

}
