package ormExpressCorreos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

// @TODO completar las anotaciones de la clase
public class Direccion {
    // @TODO completar las anotaciones de todos los atributos

    public Direccion(Int numero, Int piso, String letra, String portal, ...){  // @TODO: completar
        // @TODO completar el constructor de la clase.
        //  Para ello son necesarios dos enteros con el número y el piso, y dos strings
        // con la letra y el portal
        //  Cree e inicialice el resto de atributos a los valores que considere oportunos
    }

    public Int getnumero(){ return this.numero; }
    public Int getpiso(){ return this.piso; }
    public String getletra(){ return this.letra; }
    public String getportal(){ return this.portal; }

    public String getdireccioncompleta() {
        // @TODO completar para que devuelva la dirección completa de un usuario
        return direccion_completa
    }
}
