package entity;

public class GeneroRecital  {

	private String descripcion;

	// CONSTRUCTORES

	public GeneroRecital() {
	}

	public GeneroRecital(String descripcion) {

		

			switch (descripcion) {
			case "rock":
				this.descripcion = descripcion;
				break;
			case "heavy metal":
				this.descripcion = descripcion;
				break;
			case "reggaeton":
				this.descripcion = descripcion;
				break;
			case "trap":
				this.descripcion = descripcion;
				break;
			case "latino":
				this.descripcion = descripcion;
				break;
			case "pop":
				this.descripcion = descripcion;
				break;
			default:
				this.descripcion = "Error en genero";
				break;
			}
		
	
		}

	

	// METODOS

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
