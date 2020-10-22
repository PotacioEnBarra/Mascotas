package co.edu.konrad.crudusuarios.controller;

import co.edu.konrad.crudusuarios.model.Mascota;
import co.edu.konrad.crudusuarios.service.API.MascotaServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MascotaController {
   @Autowired
    private MascotaServiceApi MascotaServiceAPI;

   @RequestMapping("/inicio_mascota")
    public String index(Model model){
        model.addAttribute("list", MascotaServiceAPI.getAll());
        return "indexMascotas";
    } 
    @GetMapping("/inicio_mascota/save/{id}")
    public String viewSave(@PathVariable("id") Long id, Model model){
        if (id != null && id != 0){
            model.addAttribute("mascota", MascotaServiceAPI.get(id));
        }else{
            model.addAttribute("mascota", new Mascota());
        }
        return "saveMascotas";
    }

   @PostMapping("/inicio_mascota/save")
    public String save(Mascota mascota){
        MascotaServiceAPI.save(mascota);
        return "redirect:/inicio_mascota";
    }
    @GetMapping("/inicio_mascota/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        MascotaServiceAPI.delete(id);
        return "redirect:/inicio_mascota";
    }
}