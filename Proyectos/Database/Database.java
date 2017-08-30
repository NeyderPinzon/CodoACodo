package com.codoacodo.gjallarhorn;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.naming.OperationNotSupportedException;

/**
 * Acceso a la Creacion de la Base de Datos
 * @author Yo
 */

public class Database {

    private Connection conexion;
            
    public Database(String url, String pass, String base, String user)throws OperationNotSupportedException {
        conexion = createConnection(url, base, user, pass);
    }

    public void setup() {
        cargarPersona();
        cargarLegajo();
    }
    /**
     * Método encargado de crear la tabla "Legajo"
     */
    private void cargarLegajo() {
        StringBuffer buffer = new StringBuffer("id INT NOT NULL AUTO_INCREMENT,");
        buffer.append("cuit VARCHAR(20),").append("pesona_id INT,")
                .append("PRIMARY KEY (id),").append("FOREING KEY (persona_id),")
                .append("REFERENCES persona(id)");
    }
    
    /**
     * Metodo encargado de cear la tabla "Persona"
     */
    private void cargarPersona() {
        StringBuffer buffer = new StringBuffer("id INT NOT NULL AUTO_INCREMENT,");
                buffer.append("edad INT,").append("apellido VARCHAR(20),")
                .append("nombre VARCHAR(20),").append("PRIMARY KEY (id)");
        
        createTable("persona", buffer.toString());
        
        String nombreTabla = "persona";
        String atributos = "apellido, nombre, edad";

        insertData(nombreTabla, atributos, "\"Aladro\", \"Juan\", 65");
        insertData(nombreTabla, atributos, "\"Aladro\", \"Alfredo\", 35");
        
    }
    
        
    private boolean createTable(String nombre, String atributos) {
        try {
            
            String query = "create table " + nombre + "(" + atributos + ")";
            this.conexion.createStatement().execute(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean insertData(String tabla, String atributos, String valores){
            try {
            
            String query = "insert into " + tabla + "(" + atributos + ") values("+ valores+")";
            this.conexion.createStatement().execute(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    private boolean deleteTable(String nombre) {
        try {
            
            String query = "drop table " + nombre;
            conexion.createStatement().execute(query);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private Connection createConnection(String url, String base, String user, String pass) throws OperationNotSupportedException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url + base,
                    user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new OperationNotSupportedException("ERROR de conexion");
    }
}
