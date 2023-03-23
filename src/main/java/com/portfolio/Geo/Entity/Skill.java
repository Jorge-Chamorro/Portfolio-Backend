
package com.portfolio.Geo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
      
    @NotNull
    private Integer porcentaje;
    
    
    @NotNull
    @Size(min = 1, max = 50, message = "La cantidad de caracteres es erronea") 
    private String subtitulo;
    
    @NotNull
    @Size(min = 1, max = 30, message = "La cantidad de caracteres es erronea") 
    private String color_inner;
    
    @NotNull
    @Size(min = 1, max = 30, message = "La cantidad de caracteres es erronea") 
    private String color_outer;
    
}
 