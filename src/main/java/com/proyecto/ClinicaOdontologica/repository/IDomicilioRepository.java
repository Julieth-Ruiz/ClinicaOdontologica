package com.proyecto.ClinicaOdontologica.repository;

import com.proyecto.ClinicaOdontologica.model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface    IDomicilioRepository extends JpaRepository<Domicilio,Integer> {
}
