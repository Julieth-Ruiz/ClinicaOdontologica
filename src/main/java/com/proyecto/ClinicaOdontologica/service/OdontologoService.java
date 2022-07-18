package com.proyecto.ClinicaOdontologica.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.ClinicaOdontologica.model.Odontologo;
import com.proyecto.ClinicaOdontologica.repository.IOdontologoRepository;
import org.apache.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service

public class OdontologoService implements IOdontologoService {

    public static final Logger logger = Logger.getLogger(OdontologoService.class);

    @Autowired
    private IOdontologoRepository odontologoRepository;


    @Override
    public void agregar(Odontologo odontologo) {
        odontologoRepository.save(odontologo);
        logger.info("odontologo creado");
    }

    @Override
    public Odontologo buscar(Integer id) {

        Odontologo newOdontologo = odontologoRepository.findById(id).orElse(null);
        return newOdontologo;
    }

    @Override
    public void modificar(Odontologo odontologo) {
        odontologoRepository.save(odontologo);
    }

    @Override
    public void eliminar(Integer id) {
        odontologoRepository.deleteById(id);
    }

    @Override
    public List<Odontologo> listar() {
        return odontologoRepository.findAll();
    }
}
