package supermercado;

public class tipoMovimiento{
	
	private String nombre;
	
	public tipoMovimiento(String nombre) {
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
		return "tipoMovimiento [nombre=" + nombre + "]";
	}

	
}
