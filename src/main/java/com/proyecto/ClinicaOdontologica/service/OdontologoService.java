package com.proyecto.ClinicaOdontologica.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.ClinicaOdontologica.dto.OdontologoDTO;
import com.proyecto.ClinicaOdontologica.model.Odontologo;
import com.proyecto.ClinicaOdontologica.repository.IOdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service

public class OdontologoService implements IOdontologoService {

    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void agregar(OdontologoDTO odontologo) {
        Odontologo newOdontologo = mapper.convertValue(odontologo, Odontologo.class);
        //Devuelve un objeto del tipo odontologo
        odontologoRepository.save(newOdontologo);
    }

    @Override
    public OdontologoDTO buscar(Integer id) {
        // El optional es un objeto al que se le puede preguntar si es nulo o no
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        OdontologoDTO newOdontologo = null;
        if (odontologo.isPresent())
            newOdontologo = mapper.convertValue(odontologo, OdontologoDTO.class);

        return newOdontologo;
    }

    @Override
    public void modificar(OdontologoDTO odontologo) {
        // Obtiene el id si lo encuentra vacio crea un odontologo sino lo modifica
        Odontologo newOdontologo = mapper.convertValue(odontologo, Odontologo.class);
        odontologoRepository.save(newOdontologo);
    }

    @Override
    public void eliminar(Integer id) {
        odontologoRepository.deleteById(id);
    }

    @Override
    public Set<OdontologoDTO> listar() {
        List<Odontologo> odontologos = odontologoRepository.findAll();
        //  Se declara un objeto no la interface
        Set<OdontologoDTO> odontologosDTO = new HashSet<OdontologoDTO>();
        //Por cada odontologo en odontologos se llena el Set
        for (Odontologo odontologo:odontologos)
            //Transfoma lo que trae el ORM odontologos en odontologoDTO
            odontologosDTO.add(mapper.convertValue(odontologo,OdontologoDTO.class));
        return odontologosDTO;
    }
}
