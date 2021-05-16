package entity;

import java.time.LocalDate;

//LeoPrueba

public abstract class Eventos {

	private int idEvento;
	private String titulo;
	private LocalDate fecha;
	private int duracion;

	// CONSTRUCTORES

	public Eventos() {
	}

	public Eventos(int idevento, String titulo, LocalDate fecha, int duracion) {
		this.idEvento = idevento;
		this.titulo = titulo;
		this.fecha = fecha;
		this.duracion = duracion;
	}

	// METODOS

	public int getDuracion() {
		return duracion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idevento) {
		this.idEvento = idevento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", titulo=" + titulo + ", tipoEvento=" + ", duracion=" + duracion + "]";
	}
	
	// TODO: ESTO ESTÁ MAL IMPLEMENTADO bonificaCorporativo, QUE HACEMOS?

	public abstract double bonificaCorporativo(int cantInvitados);

}
