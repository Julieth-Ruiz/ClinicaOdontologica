package com.proyecto.ClinicaOdontologica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Domicilio {

    @Id
    @GeneratedValue
    private Integer id;

    private String calle;
    private String numero;
    private String localidad;
    private String provincia;

}
