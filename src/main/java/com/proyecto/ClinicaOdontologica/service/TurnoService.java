package com.proyecto.ClinicaOdontologica.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.ClinicaOdontologica.dto.TurnoDTO;
import com.proyecto.ClinicaOdontologica.model.Turno;
import com.proyecto.ClinicaOdontologica.repository.ITurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TurnoService implements ITurnoService {
    @Autowired
    private ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void agregar(TurnoDTO turno) {
        Turno newTurno = mapper.convertValue(turno,Turno.class);
        turnoRepository.save(newTurno);
    }

    @Override
    public Set<TurnoDTO> listar() {
        List<Turno> turnos = turnoRepository.findAll();
        //  Se declara un objeto no la interface
        Set<TurnoDTO> turnosDTO = new HashSet<TurnoDTO>();
        //Por cada turno en turnos se llena el Set
        for (Turno turno:turnos)
            //Transfoma lo que trae el ORM turno en turnoDTO
            turnosDTO.add(mapper.convertValue(turno,TurnoDTO.class));
        return turnosDTO;
    }
}
