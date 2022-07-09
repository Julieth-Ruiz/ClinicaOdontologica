package com.proyecto.ClinicaOdontologica.service;

import com.proyecto.ClinicaOdontologica.dto.TurnoDTO;
import com.proyecto.ClinicaOdontologica.model.Turno;

import java.util.Set;

public interface ITurnoService {

    void agregar(Turno turno);
    Turno buscar(Integer id);
    void modificar( Turno turno);
    void eliminar (Integer id);
    Set<TurnoDTO> listar();

}
