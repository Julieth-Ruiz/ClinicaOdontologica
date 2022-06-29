package com.proyecto.ClinicaOdontologica.service;

import com.proyecto.ClinicaOdontologica.dto.OdontologoDTO;

import java.util.Set;

public interface IOdontologoService {

    void agregar(OdontologoDTO odontologo);
    OdontologoDTO buscar(Integer id);
    void modificar(OdontologoDTO odontologo);
    void eliminar (Integer id);
    Set<OdontologoDTO> listar();


}

