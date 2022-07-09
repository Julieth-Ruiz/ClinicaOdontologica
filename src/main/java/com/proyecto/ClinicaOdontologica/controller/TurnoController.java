package com.proyecto.ClinicaOdontologica.controller;

import com.proyecto.ClinicaOdontologica.dto.TurnoDTO;
import com.proyecto.ClinicaOdontologica.model.Paciente;
import com.proyecto.ClinicaOdontologica.model.Turno;
import com.proyecto.ClinicaOdontologica.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    @Autowired
    ITurnoService turnoService;

    @PostMapping
    public ResponseEntity<?> guardarTurno(@RequestBody Turno turno){
        turnoService.agregar(turno);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Turno buscarTurno(@PathVariable Integer id){
        return turnoService.buscar(id);
    }

    @PutMapping()
    public ResponseEntity<?> modificarTurno(@RequestBody Turno turno){
        turnoService.modificar(turno);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Integer id){
        turnoService.eliminar(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }





}