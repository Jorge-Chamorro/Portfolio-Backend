
package com.portfolio.Geo.Controller;

import com.portfolio.Geo.Entity.Skill;
import com.portfolio.Geo.Interface.ISkillService;
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
public class SkillController {
    @Autowired ISkillService iskillService;
    
    @GetMapping("/hyss/get")
    public List<Skill> getSkill(){
        return iskillService.getSkill();
    }
    
    @PostMapping("/hyss/post")
    public Skill createSkill (@RequestBody Skill skill){
        iskillService.saveSkill(skill);
        return skill;
       
    }
        
    @DeleteMapping("/hyss/delete/{id}")
    public void deleteSkill(@PathVariable Long id){
        iskillService.deleteSkill(id);
        
    }
    
    @PutMapping("/hyss/put/{id}")
    public Skill editPersona(@PathVariable Long id,
                               @RequestBody Skill skill){
        
        Skill skillActual = iskillService.findSkill(id);
        
       
        
        skillActual.setPorcentaje(skill.getPorcentaje());
        skillActual.setSubtitulo(skill.getSubtitulo());
        skillActual.setColor_inner(skill.getColor_inner());
        skillActual.setColor_outer(skill.getColor_outer());
        
        
        iskillService.saveSkill(skillActual);
        return skillActual;
    }
    
}