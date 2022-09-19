package com.example.odontologo.controller;

import com.example.odontologo.domain.Odontologo;
import com.example.odontologo.services.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
//@RequestMapping("odontologos")
public class OdontologoController {

    private final OdontologoService odontologoService;

    @Autowired
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @GetMapping("/")
    public Odontologo landing(){
        Odontologo odo = new Odontologo("Odontologo landing page");
        return odo;
    }

    @GetMapping("odontologos")
    public List<Odontologo> getOdontologos(){
        return odontologoService.list_odontologo();
    }
}
