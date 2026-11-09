package DAO;

import Excepciones.DBConexionException;
import Excepciones.DBTablaCreationException;
import Modelo.Propietario;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class ConexionPropietario {
    public static void crearTablaPropietario() throws DBConexionException {
        try {
        Connection conexion = ConexionDB.obtenerConexion();
        String query = "CREATE TABLE IF NOT EXISTS propietarios (" +
                "  dni VARCHAR(15) NOT NULL," +
                "  nombre VARCHAR(50) NOT NULL," +
                "  celular VARCHAR(20) NOT NULL," +
                "  PRIMARY KEY (dni));";

            Statement ps  = conexion.createStatement();
            ps.execute(query);
        } catch (SQLException e) {
            throw new DBTablaCreationException();
        }
        finally {
            ConexionDB.cerrarConexion();
        }
    }

    public static void insertarPropietario(Propietario propietario)throws DBConexionException {
        Connection conexion = ConexionDB.obtenerConexion();
        String query = "insert into propietarios values (?, ?, ?)";
        try {
            PreparedStatement ps  = conexion.prepareStatement(query);
            ps.setString(1, propietario.getDni());
            ps.setString(2, propietario.getNombre());
            ps.setString(3, propietario.getCelular());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DBTablaCreationException();
        }
        finally {
            ConexionDB.cerrarConexion();
        }
    }

    public static Map<String, Propietario> listarPropietarios()throws DBConexionException {
        Connection conexion = ConexionDB.obtenerConexion();
        String query = "select * from propietarios";
        try {
            Statement ps  = conexion.createStatement();

            ResultSet rs = ps.executeQuery(query);
            Map<String, Propietario> propietariosMapa = new HashMap<String, Propietario>();
            Propietario propietario;
            while(rs.next()){
                propietario = new Propietario(rs.getString("dni"), rs.getString("nombre"), rs.getString("celular"));
                propietariosMapa.put(propietario.getDni(), propietario);
            }
            return  propietariosMapa;
        } catch (SQLException e) {
            throw new DBTablaCreationException();
        }
        finally {
            ConexionDB.cerrarConexion();
        }
    }
}
