
package com.portfolio.Geo.Interface;

import com.portfolio.Geo.Entity.Skill;
import java.util.List;


public interface ISkillService {
    
            //Traer un lista de objetos educacion
    public List<Skill> getSkill();
    
    //metodo para guardar en la Bd un objeto educacion
    public void saveSkill(Skill skill);
    
    //metodo para borrar un objeto buscandolo por id
    public void deleteSkill(Long id);
    
    //metodo para buscar una educacion por ID
    public Skill findSkill(Long id);
    
    
}
