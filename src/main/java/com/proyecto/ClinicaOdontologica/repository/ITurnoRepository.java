package com.proyecto.ClinicaOdontologica.repository;

import com.proyecto.ClinicaOdontologica.model.Turno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITurnoRepository extends JpaRepository<Turno,Integer> {
}
