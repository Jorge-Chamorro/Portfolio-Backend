
package com.portfolio.Geo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;

import lombok.Setter;



@Getter
@Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @NotNull
    @Size(min = 1, max = 100, message = "La cantidad de caracteres es erronea" )
    private String institucion;
    
    @NotNull
    @Size(min = 1, max = 100, message = "La cantidad de caracteres es erronea" )
    private String titulo;
    
    @NotNull
    @Size(min = 1, max = 10, message = "La cantidad de caracteres es erronea" )
    private String fecha_inicio;
    
    @NotNull
    @Size(min = 1, max = 10, message = "La cantidad de caracteres es erronea" )
    private String fecha_final;
    
    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String url_titulo;
    
    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String descripcion;
    
}
