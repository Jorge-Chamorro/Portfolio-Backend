
package com.portfolio.Geo.Controller;

import com.portfolio.Geo.Entity.Proyectos;
import com.portfolio.Geo.Interface.IProyectosService;
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
public class ProyectosCrontoller {
    @Autowired IProyectosService iproyectosService;
    
    @GetMapping("/proyectos/get")
    public List<Proyectos> getProyectos(){
        return iproyectosService.getProyectos();
    }
    
    @PostMapping("/proyectos/post")
    public Proyectos createProyectos (@RequestBody Proyectos proyecto){
        iproyectosService.saveProyectos(proyecto);
        return proyecto;
       
    }
    
    @DeleteMapping("/proyectos/delete/{id}")
    public void deleteProyectos(@PathVariable Long id){
        iproyectosService.deleteProyectos(id);
        
    }
    
    @PutMapping("/proyectos/put/{id}")
    public Proyectos editProyectos(@PathVariable Long id,
                               @RequestBody Proyectos proyecto){
        
        Proyectos proyectoActual = iproyectosService.findProyectos(id);
        
       
        proyectoActual.setNombre_proyecto(proyecto.getNombre_proyecto());
        proyectoActual.setDescripcion_proyecto(proyecto.getDescripcion_proyecto());
        proyectoActual.setUrl_foto_proyecto(proyecto.getUrl_foto_proyecto());
        proyectoActual.setUrl_direccion_proyecto(proyecto.getUrl_direccion_proyecto());
        
        
        iproyectosService.saveProyectos(proyectoActual);
        return proyectoActual;
    }
    
    
    
}
