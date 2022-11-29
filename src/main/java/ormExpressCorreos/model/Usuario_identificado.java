package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
public class Usuario_identificado {
    
    // @TODO completar las anotaciones de todos los atributos
    public Usuario_identificado(String DNI, String nombre, String apellidos, String email, ...){  // @TODO: completar
        // @TODO completar el constructor de la clase.
        //  Para ello son necesarios strings con el DNI, el nombre, los apellidos y el email del usuario
        //  Cree e inicialice el resto de atributos a los valores que considere oportunos
    }

    public String getDNI(){ return this.DNI;}
    public String getnombre(){ return this.nombre;}
    public String getapellidos(){ return this.apellidos;}
    public String getemail(){ return this.email;}
}
