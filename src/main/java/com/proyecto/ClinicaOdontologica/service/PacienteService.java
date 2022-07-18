package com.proyecto.ClinicaOdontologica.service;

import com.proyecto.ClinicaOdontologica.model.Paciente;
import com.proyecto.ClinicaOdontologica.repository.IPacienteRepository;
import org.apache.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service

public class PacienteService implements IPacienteService {

    public static final Logger logger = Logger.getLogger(PacienteService.class);
    @Autowired
    private IPacienteRepository pacienteRepository;


    @Override
    public void agregar(Paciente paciente) {
         pacienteRepository.save(paciente);
         logger.info("paciente creado");
    }

    @Override
    public Paciente buscar(Integer id) {
            Paciente newPaciente = pacienteRepository.findById(id).orElse(null);
        return newPaciente;

    }

    @Override
    public void modificar(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    @Override
    public void eliminar(Integer id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public List<Paciente> listar() {
        return  pacienteRepository.findAll();
    }
}
