
package com.tienda.controller;

import com.tienda.entity.Persona;
import com.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PersonasController {
    
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/personas")
    public String index(Model model){
        List<Persona> listaPersonas=personaService.getAllperson();
        //System.out.println(listaPersonas);
        model.addAttribute("titulo","Personas");
        model.addAttribute("personas",listaPersonas);
        return "personas";
    }
    

    
}
