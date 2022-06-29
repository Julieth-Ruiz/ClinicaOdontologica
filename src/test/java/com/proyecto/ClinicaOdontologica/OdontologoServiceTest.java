package com.proyecto.ClinicaOdontologica;

import com.proyecto.ClinicaOdontologica.dto.OdontologoDTO;
import com.proyecto.ClinicaOdontologica.service.OdontologoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class OdontologoServiceTest {
    @Autowired
    OdontologoService odontologoService;


    @Test
    public void agregar(){
        OdontologoDTO odontologoDto=new OdontologoDTO();
        odontologoService.agregar(odontologoDto);
        OdontologoDTO odontologoDiomer=odontologoService.buscar(1);
        assertTrue(odontologoService.listar().size()>0);
    }
}
