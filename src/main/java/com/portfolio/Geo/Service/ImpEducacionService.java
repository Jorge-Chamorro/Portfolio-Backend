
package com.portfolio.Geo.Service;

import com.portfolio.Geo.Entity.Educacion;
import com.portfolio.Geo.Interface.IEducacionService;
import com.portfolio.Geo.Repository.IEducacionRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ImpEducacionService implements IEducacionService {

    @Autowired IEducacionRepository ieducacionRepository;
    
    @Override
    public List<Educacion> getEducacion() {
      List<Educacion> educacion = ieducacionRepository.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
         ieducacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id) {
        ieducacionRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
      Educacion educacion = ieducacionRepository.findById(id).orElse(null);
        return educacion;
    }
    
    
    
}
