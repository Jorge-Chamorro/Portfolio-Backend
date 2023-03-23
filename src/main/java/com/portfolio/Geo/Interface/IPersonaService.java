
package com.portfolio.Geo.Interface;

import com.portfolio.Geo.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    
    //Traer un lista de objetos persona
    public List<Persona> getPersona();
    
    //metodo para guardar en la Bd un objeto persona
    public void savePersona(Persona persona);
    
    //metodo para borrar un objeto buscandolo por id
    public void deletePersona(Long id);
    
    //metodo para buscar una persona por ID
    public Persona findPersona(Long id);
}
