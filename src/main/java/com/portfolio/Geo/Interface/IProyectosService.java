
package com.portfolio.Geo.Interface;

import com.portfolio.Geo.Entity.Proyectos;
import java.util.List;


public interface IProyectosService {
    
            //Traer un lista de objetos educacion
    public List<Proyectos> getProyectos();
    
    //metodo para guardar en la Bd un objeto educacion
    public void saveProyectos(Proyectos proyecto);
    
    //metodo para borrar un objeto buscandolo por id
    public void deleteProyectos(Long id);
    
    //metodo para buscar una educacion por ID
    public Proyectos findProyectos(Long id);
}
