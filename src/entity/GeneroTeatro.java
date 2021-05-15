package entity;

public class GeneroTeatro {
	private String descripcion;

	// CONSTRUCTORES

	public GeneroTeatro() {
	}

	public GeneroTeatro(String descripcion) {

	
	switch (descripcion) {
	case "drama":
		this.descripcion = descripcion;
		break;
	case "teatro":
		this.descripcion = descripcion;
		break;
	case "comedia":
		this.descripcion = descripcion;
		break;
	default:
		this.descripcion = "Error en genero";
		break;
	}
	
	}

	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

}

	