package com.proyecto.ClinicaOdontologica.service;

import com.proyecto.ClinicaOdontologica.dto.OdontologoDTO;
import com.proyecto.ClinicaOdontologica.model.Odontologo;

import java.util.List;
import java.util.Set;

public interface IOdontologoService {

    void agregar(Odontologo odontologo);
    Odontologo buscar(Integer id);
    void modificar(Odontologo odontologo);
    void eliminar (Integer id);
    List<Odontologo> listar();


}

