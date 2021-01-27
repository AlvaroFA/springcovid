package com.example.demo.controller;

import com.example.demo.bean.Datos;
import com.example.demo.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*Controlador generico*/
@RestController
public class Controller {

    @Autowired
    DatosService datosService;

    @GetMapping(path = "/datos")
    public @ResponseBody Datos obtenerDatos(){
        return datosService.getListaDatos();
    }


}


