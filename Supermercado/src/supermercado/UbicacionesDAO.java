package supermercado;

import java.sql.*;

public class UbicacionesDAO implements CRUD<Ubicaciones>{

	Connection db = Conexion.ConectarBD();

	@Override
	public void agregar(Ubicaciones ubicacion) {
		try {
			String sql = "call agregarUbicaciones('" + ubicacion.getNombre() + "')";
			Statement stmt = db.createStatement();	
			int result = stmt.executeUpdate(sql);
			if(result==1) {
				System.out.println("Datos Insertados - Ubicaciones");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void eliminar(int id) {
		try {
			String sql = "call borrarUbicaciones(" + id + ")";
			Statement stmt = db.createStatement();	
			int result = stmt.executeUpdate(sql);
			if(result==1) {
				System.out.println("Datos Eliminados - Ubicaciones");
			} else {
				System.out.println("Datos no existentes - Ubicaciones");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void modificar(int id, Ubicaciones ubicacion) {
		try {
			String sql = "call modificarUbicaciones(" + id + ", '" + ubicacion.getNombre() + "')";
			Statement stmt = db.createStatement();	
			int result = stmt.executeUpdate(sql);
			if(result==1) {
				System.out.println("Datos Modificados - Ubicaciones");
			} else {
				System.out.println("Datos no existentes - Ubicaciones");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void mostrarDatos() {
		try {
			
			String sql = "call mostrarUbicaciones()";
			Statement stmt = db.createStatement();	
			ResultSet result = stmt.executeQuery(sql);
			while(result.next()) {
				System.out.println(result.getInt("id_ubicacion") + " \t" + result.getString("ubi_nombre"));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
