
package com.portfolio.Geo.Service;


import com.portfolio.Geo.Entity.Proyectos;
import com.portfolio.Geo.Interface.IProyectosService;
import com.portfolio.Geo.Repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectosService implements IProyectosService{
    
    @Autowired IProyectosRepository iproyectosRepository;

    @Override
    public List<Proyectos> getProyectos() {
      List<Proyectos> proyecto = iproyectosRepository.findAll ();  
      return proyecto;
    }

    @Override
    public void saveProyectos(Proyectos proyecto) {
       iproyectosRepository.save(proyecto);
    }

    @Override
    public void deleteProyectos(Long id) {
        iproyectosRepository.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos proyecto = iproyectosRepository.findById(id).orElse(null);
        return proyecto;
    }


    
}
