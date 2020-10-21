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

public class PersonaController {
   @Autowired
    private PersonaServiceAPI personaServiceAPI;

   @RequestMapping("/inicio_persona")
    public String index(Model model){
        model.addAttribute("list", personaServiceAPI.getAll());
        return "indexPersona";
    } 

   @GetMapping("/inicio_persona/save/{id}")
    public String viewSave(@PathVariable("id") Long id, Model model){
        if (id != null && id != 0){
            model.addAttribute("persona", personaServiceAPI.get(id));
        }else{
            model.addAttribute("persona", new Persona());
        }
        return "save";
    }

   @PostMapping("/inicio_persona/save")
    public String save(Persona persona){
        personaServiceAPI.save(persona);
        return "redirect:/inicio_persona";
    }

   @GetMapping("/inicio_persona/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        personaServiceAPI.delete(id);
        return "redirect:/inicio_persona";
    }
}