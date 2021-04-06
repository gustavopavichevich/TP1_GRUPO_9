package entity;

public class Bandas {
	//private int idBanda;
	private String nombre;
	/*public int getIdBanda() {
		return idBanda;
	}
	public void setIdBanda(int idBanda) {
		this.idBanda = idBanda;
	}*/
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
