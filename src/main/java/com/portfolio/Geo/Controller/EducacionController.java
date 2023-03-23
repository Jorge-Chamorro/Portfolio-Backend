
package com.portfolio.Geo.Controller;

import com.portfolio.Geo.Entity.Educacion;
import com.portfolio.Geo.Interface.IEducacionService;
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
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping("/educacion/get")
    public List<Educacion> getEducacion(){
        return ieducacionService.getEducacion();
    }
    
    @PostMapping("/educacion/post")
    public Educacion createEducacion (@RequestBody Educacion educacion){
        ieducacionService.saveEducacion(educacion);
        return educacion;
       
    }
    
    @DeleteMapping("/educacion/delete/{id}")
    public void deleteEducacion(@PathVariable Long id){
        ieducacionService.deleteEducacion(id);
        
    }
    
    @PutMapping("/educacion/put/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                               @RequestBody Educacion educacion){
        
        Educacion educacionActual = ieducacionService.findEducacion(id);
        
       
        educacionActual.setInstitucion(educacion.getInstitucion());
        educacionActual.setTitulo(educacion.getTitulo());
        educacionActual.setFecha_inicio(educacion.getFecha_inicio());
        educacionActual.setFecha_final(educacion.getFecha_final());
        educacionActual.setUrl_titulo(educacion.getUrl_titulo());
        educacionActual.setDescripcion(educacion.getDescripcion());
        
        ieducacionService.saveEducacion(educacionActual);
        return educacionActual;
    }
    
}


