package db;

import java.sql.*;

public class Conexion {
    String strConexionDb = "jdbc:sqlite:tienda.s3db";
    Connection conectar = null;
    
    public Connection conectar(){
        try {
            Class.forName("org.sqlite.JDBC");

            conectar = DriverManager.getConnection(strConexionDb);

            System.out.println("Conexion establecida.");

        } catch (Exception e) {
            System.out.println("Error de conexion : " + e);
        }
        
        return conectar;
    }
    
   
}
