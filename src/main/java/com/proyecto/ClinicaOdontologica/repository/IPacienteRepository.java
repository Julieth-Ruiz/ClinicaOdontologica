package com.proyecto.ClinicaOdontologica.repository;

import com.proyecto.ClinicaOdontologica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepository extends JpaRepository<Paciente,Integer> {
}
