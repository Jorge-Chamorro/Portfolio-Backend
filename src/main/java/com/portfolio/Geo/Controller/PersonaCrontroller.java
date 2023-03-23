
package com.portfolio.Geo.Controller;

import com.portfolio.Geo.Entity.Persona;
import com.portfolio.Geo.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaCrontroller {
    @Autowired IPersonaService ipersonaService;
   
    @GetMapping("/personas/get")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @GetMapping("/personas/get/perfil")
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }
    
    @PostMapping("/personas/post")
    public String createPersona (@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue agregada correctamente";
    }
    
    @DeleteMapping("/personas/delete/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue borrada correctamente";
    }
    
    @PutMapping("/personas/put/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestBody Persona persona){
        
        Persona personaActual = ipersonaService.findPersona(id);
        
        personaActual.setNombre(persona.getNombre());
        personaActual.setApellido(persona.getApellido());
        personaActual.setUrl_foto(persona.getUrl_foto());
        personaActual.setSobre_mi(persona.getSobre_mi());
        personaActual.setCorreo(persona.getCorreo());
        
        ipersonaService.savePersona(personaActual);
        return personaActual;
    }
    
    
}
