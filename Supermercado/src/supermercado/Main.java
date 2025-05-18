package supermercado;

public class Main {

	public static void main(String[] args) {
		CRUD<Ubicaciones> ubicacionDAO = new UbicacionesDAO();
		Ubicaciones u1 = new Ubicaciones("Almacen");
		ubicacionDAO.agregar(u1);
		ubicacionDAO.mostrarDatos();
	}
	
}
