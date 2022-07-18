package com.proyecto.ClinicaOdontologica;

import com.proyecto.ClinicaOdontologica.exception.ResourceNotFoundException;
import org.apache.log4j.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = Logger.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> errores(Exception ex, WebRequest req)
    {
        logger.error(ex.getMessage());
        return new ResponseEntity("Error" + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> procesarErrores(Exception ex, WebRequest req)
    {
        logger.error(ex.getMessage());
        return new ResponseEntity("Error" + ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
