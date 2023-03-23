
package com.portfolio.Geo.Interface;

import com.portfolio.Geo.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia();
    
    public void saveExperiencia(Experiencia experiencia);
    
    public void deleteExperiencia(Long id);
    
    public Experiencia findEducacion(Long id);
    
}
