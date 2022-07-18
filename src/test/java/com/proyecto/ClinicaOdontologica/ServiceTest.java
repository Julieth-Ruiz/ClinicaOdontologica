package com.proyecto.ClinicaOdontologica;


import com.proyecto.ClinicaOdontologica.model.Domicilio;
import com.proyecto.ClinicaOdontologica.model.Odontologo;
import com.proyecto.ClinicaOdontologica.model.Paciente;
import com.proyecto.ClinicaOdontologica.service.IOdontologoService;
import com.proyecto.ClinicaOdontologica.service.IPacienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ServiceTest {

    @Autowired
    IOdontologoService odontologoService;

    @Autowired
    IPacienteService pacienteService;

    public void cargarData(){
        Domicilio domicilio = new Domicilio("calle 123",23,"Provenza","Floridablanca");
        pacienteService.agregar(new Paciente("Oscar","Ortiz",domicilio,345987, new Date()));
    }

    @Test
    public void agregarYListarOdontologos(){
        Odontologo odontologo1 = new Odontologo();
        odontologo1.setApellido("Rojas");
        odontologo1.setMatricula(2334L);
        odontologo1.setNombre("Celi");
        odontologoService.agregar(odontologo1);
        System.out.println("Se creo el odontologo");
        List<Odontologo> listarOdontologos = odontologoService.listar();

        assertNotNull(listarOdontologos);
        assertTrue(odontologoService.listar().size() > 0);
    }

    @Test
    public void agregarYBuscarPaciente(){
        cargarData();
        Domicilio domicilio1 = new Domicilio("calle 222",76,"Usme","Bogotá");
        Paciente paciente1 = new Paciente("Karen","Aponte",domicilio1,455433, new Date());
        pacienteService.agregar(paciente1);

        assertNotNull(pacienteService.buscar(paciente1.getId()));

    }


}




