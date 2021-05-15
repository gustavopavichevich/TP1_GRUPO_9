package entity;

public class Localidad extends Provincia  {
	
	private int id_localidad;
	private String nombre;
	Provincia  id_provincia;
	
	
	
	
	// gets and Sets
	public int getId_localidad() {
		return id_localidad;
	}
	public void setId_localidad(int id_localidad) {
		this.id_localidad = id_localidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
