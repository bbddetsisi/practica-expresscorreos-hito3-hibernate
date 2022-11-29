package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
public class Usuario_generico {
    
    // @TODO completar las anotaciones de todos los atributos
    public Usuario_generico(Long id, String nombre, String apellidos, ...){  // @TODO: completar
        // @TODO completar el constructor de la clase.
        //  Para ello es necesario un "long"" con la ID, un string con el nombre del usuario y otro string con el apellido
        //  Cree e inicialice el resto de atributos a los valores que considere oportunos
    }

    public Long getid(){ return this.id;}
    public String getnombre(){ return this.nombre;}
    public String getapellidos(){ return this.apellidos;}
}
