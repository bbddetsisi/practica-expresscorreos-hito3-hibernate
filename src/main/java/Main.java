import ormExpressCorreos.Controller;
import ormExpressCorreos.model.Usuario_generico;
import ormExpressCorreos.model.Usuario_identificado;
import ormExpressCorreos.model.Direccion;

import java.sql.SQLException;

public class Main {

    public static void main (String [] args) {
        try {
            Controller controlador= new Controller();
            //@TODO añada las llamadas a las funciones de la clase Controller.java necesarias
            //para la creación del usuario identificado y la direccion.
            if(Usuario_identificado!=null && direccion!=null)
                System.out.println("Se ha creado el usuario identificado " + usuario.getnombre() + " con DNI " + usuario.getdni() + 
                " que vive en " + direccion.getdireccioncompleta());
        } catch(SQLException e) {
            System.err.println("Se ha producido un error en la conexión con la base de datos");
            e.printStackTrace();
        }
    }
}
