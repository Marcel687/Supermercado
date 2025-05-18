package supermercado;

public interface CRUD<T> {
	void agregar(T obj);
	void eliminar(int id);
	void modificar(int id,T obj);
	void mostrarDatos();
}
