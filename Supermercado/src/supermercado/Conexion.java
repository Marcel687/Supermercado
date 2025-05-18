package supermercado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static final String host = "jdbc:mysql://bovedasecreta.com/";
	private static final String user = "boveda_inventario01";
	private static final String pass = "Catolica2025";
	private static final String bd = "boveda_inventario";
		
	public static Connection ConectarBD() {
		Connection conexion = null;
		
		System.out.println();
		
		try {
			conexion = DriverManager.getConnection(host+bd,user,pass);
			System.out.println("Conexion exitosa");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conexion;
	}
	
	public static void Desconexion(Connection conexion) {
		try {
			conexion.close();
			System.out.println("Desconexion realizada exitosamente");
		} catch (SQLException e) {
			System.out.println("Error al desconectar");
		}
	}
	
}
