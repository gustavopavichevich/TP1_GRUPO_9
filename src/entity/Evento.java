package entity;

import entity.Entrada;

public class Evento extends Entrada {

	private int idEvento;
	private String tipoEvento;
//	int precio;  #pavi:esta propiedad es propia de la entrada
	private int dia;
	private int mes;
	private int anio;
	private int duracion;
	

	// constructores
	public Evento() {
		super();
	}
	
	public Evento(int idevento, String tipoevento, int valor, int dia, int mes, int anio, int duracion) {
		this.idEvento = idevento;
		this.tipoEvento = tipoevento;
//		this.setTipoEntrada(|); #pavi:esto me parece que no vá
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.duracion = duracion;
	}
	// agregar variable fecha????#pavi: consideré que era necesario ingresar la fecha porque lo menciona en práctica
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int año) {
		this.anio = año;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	
//	#pavi:quito este GET&SET para trasladarlo a la entrada. 
//	public int getPrecio() {
//		return precio;
//	}
//
//	public void setPrecio(int precio) {
//		this.precio = precio;
//	}

//	public int getTiempo() {
//		return tiempo;
//	}
//
//	public void setTiempo(int tiempo) {
//		this.tiempo = tiempo;
//	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idevento) {
		this.idEvento = idevento;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoevento) {
		this.tipoEvento = tipoevento;
	}

}
