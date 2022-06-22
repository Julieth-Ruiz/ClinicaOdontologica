package com.proyecto.ClinicaOdontologica.repository;

import com.proyecto.ClinicaOdontologica.model.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOdontologoRepository extends JpaRepository<Odontologo,Integer> {
}
