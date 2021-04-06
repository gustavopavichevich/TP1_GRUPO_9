package entity;

public class Actores {
	//private int idActor;
	private String nombre;
	private String apellido;
	/*public int getIdActor() {
		return idActor;
	}
	public void setIdActor(int idActor) {
		this.idActor = idActor;
	}*/
	
	
	public String getNombre() {
		return nombre;
	}
	public Actores(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Actores [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
