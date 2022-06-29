package com.proyecto.ClinicaOdontologica.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.ClinicaOdontologica.dto.PacienteDTO;
import com.proyecto.ClinicaOdontologica.model.Paciente;
import com.proyecto.ClinicaOdontologica.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service

public class PacienteService implements IPacienteService {
    @Autowired
    private IPacienteRepository pacienteRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void agregar(PacienteDTO paciente) {
        Paciente newPaciente = mapper.convertValue(paciente, Paciente.class);
        //Devuelve un objeto del tipo paciente
        pacienteRepository.save(newPaciente);
    }

    @Override
    public PacienteDTO buscar(Integer id) {
        // El optional es un objeto al que se le puede preguntar si es nulo o no
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        PacienteDTO newPaciente = null;
        if (paciente.isPresent())
            newPaciente = mapper.convertValue(paciente, PacienteDTO.class);

        return newPaciente;
    }

    @Override
    public void modificar(PacienteDTO paciente) {
        // Obtiene el id si lo encuentra vacio crea un paciente sino lo modifica
        Paciente newPaciente = mapper.convertValue(paciente, Paciente.class);
        pacienteRepository.save(newPaciente);
    }

    @Override
    public void eliminar(Integer id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public Set<PacienteDTO> listar() {
        List<Paciente> pacientes = pacienteRepository.findAll();
        //  Se declara un objeto no la interface
        Set<PacienteDTO> pacientesDTO = new HashSet<PacienteDTO>();
        //Por cada paciente en pacientes se llena el Set
        for (Paciente paciente:pacientes)
            //Transfoma lo que trae el ORM paciente en pacienteDTO
            pacientesDTO.add(mapper.convertValue(paciente,PacienteDTO.class));
        return pacientesDTO;
    }
}
