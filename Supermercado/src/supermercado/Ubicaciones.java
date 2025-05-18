package supermercado;

public class Ubicaciones{
	
	private String nombre;
	
	public Ubicaciones(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Ubicaciones [nombre=" + nombre + "]";
	}

	
}
