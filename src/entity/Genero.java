package entity;

public class Genero {
	private int idGenero;
	private String descripcion;

	// CONSTRUCTORES

	public Genero() {
	}

	public Genero(String descripcion) {
		this.descripcion = descripcion;
	}

	// METODOS

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
