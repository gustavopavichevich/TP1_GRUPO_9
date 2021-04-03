package entity;

public class Genero {
	private int idGenero;
	private String descripcion;

	public Genero() {
		super();
	}
	
	public Genero(String descripcion) {
		this.descripcion = descripcion;
	}
	
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
