package entity;

public class Generos {
	//private int idGenero;
	private String descripcion;
	private boolean teatro;

	// CONSTRUCTORES

	public Generos() {
	}

	public Generos(String descripcion, boolean teatro) {
		
		if (teatro == false) {
			
			switch (descripcion)
			{
			case "rock": this.descripcion = descripcion;
				break;
			case "heavy metal": this.descripcion = descripcion;
			break;
			case "reggaeton": this.descripcion = descripcion;
			break;
			case "trap": this.descripcion = descripcion;
			break;
			case "latino": this.descripcion = descripcion;
			break;
			case "pop": this.descripcion = descripcion;
			break;
			default: this.descripcion = "Error en genero";
			break;
			}
		}
		else
		{

			switch (descripcion)
			{
			case "drama": this.descripcion = descripcion;
				break;
			case "teatro": this.descripcion = descripcion;
			break;
			case "comedia": this.descripcion = descripcion;
			break;
			default: this.descripcion = "Error en genero";
			break;
			}
		}
		
	}

	/*public Generos(String descripcion) {
		this.setDescripcion(descripcion);
	}*/

	// METODOS

	/*public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}*/

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isTeatro() {
		return teatro;
	}

	public void setTeatro(boolean teatro) {
		this.teatro = teatro;
	}
}
