
package com.portfolio.Geo.Interface;

import com.portfolio.Geo.Entity.Educacion;
import java.util.List;


public interface IEducacionService {
    
        //Traer un lista de objetos educacion
    public List<Educacion> getEducacion();
    
    //metodo para guardar en la Bd un objeto educacion
    public void saveEducacion(Educacion educacion);
    
    //metodo para borrar un objeto buscandolo por id
    public void deleteEducacion(Long id);
    
    //metodo para buscar una educacion por ID
    public Educacion findEducacion(Long id);
    
}
