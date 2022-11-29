package ormExpressCorreos;

import ormExpressCorreos.model.Usuario_generico;
import ormExpressCorreos.model.Usuario_identificado;
import ormExpressCorreos.model.Direccion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.*;


/**
 * Controlador de la aplicación. Por favor, revise detenidamente la clase y complete las partes omitidas
 * atendiendo a los comentarios indicados mediante @TODO
 */
public class Controller {

    private Session session;

    /**
     * Crea un nuevo controlador
     */
    public Controller () {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();

        this.session = sessionFactory.openSession();
    }

    /**
     * Crea un nuevo usuario_generico
     * param id id del usuario
     * param nombre nombre del usuario
     * param apellidos apellidos del usuario
     * @return el nuevo usuario creado
     * @throws SQLException
     */
    public Usuario_generico createUsuarioGenerico(Long id, String nombre, String apellidos, ...) throws SQLException{
        // @TODO completa este metodo para crear de forma presistente un usuario genérico

    }

    public Usuario_identificado createUsuarioIdentificado(String DNI, String nombre, String apellidos, String email, ...) throws SQLException {
        // @TODO completa este metodo para crear de forma presistente un usuario identificado

    }

    public Usuario_identificado createDireccion(Int numero, Int piso, String letra, String portal, ...) throws SQLException {
        // @TODO completa este metodo para crear de forma presistente una direccion

    }
}
