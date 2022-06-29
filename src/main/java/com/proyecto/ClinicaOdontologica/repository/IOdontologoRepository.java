package com.proyecto.ClinicaOdontologica.repository;

import com.proyecto.ClinicaOdontologica.model.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo,Integer> {
}
