
package com.portfolio.Geo.Controller;

import com.portfolio.Geo.Entity.Experiencia;
import com.portfolio.Geo.Interface.IExperienciaService;
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
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping("/experiencia/get")
    public List<Experiencia> getExperiencia(){
        return iexperienciaService.getExperiencia();
    }
    
    @PostMapping("/experiencia/post")
    public Experiencia createExperiencia (@RequestBody Experiencia experiencia){
        iexperienciaService.saveExperiencia(experiencia);
        return experiencia;
       
    }
    
    @DeleteMapping("/experiencia/delete/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
        
    }
    
    @PutMapping("/experiencia/put/{id}")
    public Experiencia editPersona(@PathVariable Long id,
                               @RequestBody Experiencia experiencia){
        
        Experiencia experienciaActual = iexperienciaService.findEducacion(id);
        
       
        experienciaActual.setEmpresa(experiencia.getEmpresa());
        experienciaActual.setUrl_foto_empresa(experiencia.getUrl_foto_empresa());
        experienciaActual.setDescripcion(experiencia.getDescripcion());
        experienciaActual.setFecha_inicio(experiencia.getFecha_inicio());
        experienciaActual.setFecha_final(experiencia.getFecha_final());
        
       
        
        iexperienciaService.saveExperiencia(experienciaActual);
        return experienciaActual;
    }
    
}
