package entity;

public class Bandas {

	private String nombre;

	// CONSTRUCTOR

	public Bandas() {
	}

	// METODOS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Bandas [nombre=" + nombre + "]";
	}

}
