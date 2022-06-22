package com.proyecto.ClinicaOdontologica.service;

import java.util.Set;

public interface ICRUDService <T> {

    T agregar(T t);
    T buscar(Integer id);
    void eliminar(Integer id);
    Set<T> listar();
    T modificar(T t);
}
