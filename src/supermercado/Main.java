package supermercado;

import java.sql.*;

public class Main {

	public static void main(String[] args) {
		Connection bd = Conexion.ConectarBD();
		Conexion.Desconexion(bd);
	}

}
