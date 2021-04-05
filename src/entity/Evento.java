package entity;

import java.util.Date;

import entity.Entrada;

public class Evento extends Entrada {

	private int idEvento;
	private String titulo;
	private String tipoEvento;
	// int precio; #pavi:esta propiedad es propia de la entrada
	private Date fecha;// #German: esto lo agrego para reemplazar los int de dia,mes y año
	// private int dia;
	// private int mes;
	// private int anio;
	private int duracion;

	// CONSTRUCTORES

	public Evento() {
		super();
	}

	public Evento(int idevento, String titulo, String tipoevento, Date fecha, int duracion, String tipoEntrada, int valor) {
		super(tipoEntrada, valor);
		this.idEvento = idevento;
		this.titulo = titulo;
		this.tipoEvento = tipoevento;
		this.fecha = fecha;
		this.duracion = duracion;
		
	}

	// METODOS

	// agregar variable fecha????#pavi: consideré que era necesario ingresar la
	// fecha porque lo menciona en práctica
	/*
	 * public int getDia() { return dia; }
	 * 
	 * public void setDia(int dia) { this.dia = dia; }
	 * 
	 * public int getMes() { return mes; }
	 * 
	 * public void setMes(int mes) { this.mes = mes; }
	 * 
	 * public int getAnio() { return anio; }
	 * 
	 * public void setAnio(int año) { this.anio = año; }
	 */

	public int getDuracion() {
		return duracion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	// #pavi:quito este GET&SET para trasladarlo a la entrada.
	// public int getPrecio() {
	// return precio;
	// }
	//
	// public void setPrecio(int precio) {
	// this.precio = precio;
	// }

	// public int getTiempo() {
	// return tiempo;
	// }
	//
	// public void setTiempo(int tiempo) {
	// this.tiempo = tiempo;
	// }

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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", titulo=" + titulo + ", tipoEvento=" + tipoEvento + ", fecha=" + fecha
				+ ", duracion=" + duracion + "]";
	}
	
	

}
