package DAO;

import Excepciones.DBConexionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = "jdbc:mysql://172.16.1.64:3306/mibd";
    private static final String User = "bdd1";
    private static final String Password = "bdd1";


    private static Connection conexion;

    public static Connection obtenerConexion() throws DBConexionException {
        try {
            conexion = DriverManager.getConnection(URL,User, Password);
        } catch (SQLException e) {
            throw new DBConexionException();
        }
        return conexion;

    }

    public static void cerrarConexion() throws DBConexionException {
        try {
            conexion.close();
        } catch (SQLException e) {
            throw new DBConexionException();
        }
    }
}
