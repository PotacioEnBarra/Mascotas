package co.edu.konrad.crudusuarios.controller;

import co.edu.konrad.crudusuarios.model.Persona;
import co.edu.konrad.crudusuarios.service.API.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Inicio {
  
   @RequestMapping("/")
    public String index(){
       
        return "inicio";
    } 
}