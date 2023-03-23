
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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "La cantidad de caracteres es erronea" )
    private String empresa;
    
    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String url_foto_empresa;
    
    @NotNull
    @Size(min = 1, max = 300, message = "La cantidad de caracteres es erronea" )
    private String descripcion;
    
    @NotNull
    @Size(min = 1, max = 10, message = "La cantidad de caracteres es erronea" )
    private String fecha_inicio;
    
    @NotNull
    @Size(min = 1, max = 10, message = "La cantidad de caracteres es erronea" )
    private String fecha_final;
    
}
