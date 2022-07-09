package com.proyecto.ClinicaOdontologica.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.ClinicaOdontologica.model.Paciente;
import com.proyecto.ClinicaOdontologica.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Set;

@Service

public class PacienteService implements IPacienteService {
    @Autowired
    private IPacienteRepository pacienteRepository;


    @Override
    public void agregar(Paciente paciente) {
         pacienteRepository.save(paciente);
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
