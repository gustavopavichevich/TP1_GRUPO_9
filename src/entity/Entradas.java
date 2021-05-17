package entity;

import java.time.LocalDate;
import java.util.List;

public abstract class Entradas extends Eventos implements Comparable<Entradas> {
	private int idEntrada;
	private static int contEntrada = 0;
	private LocalDate fecha;
	private int duracion;
	private String titulo;
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	//private List<Eventos> listaEventos;
	private int tipo;
	//0 Deportes 1Teatro 2infantiles 3recitales

	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Entradas(LocalDate fecha, int duracion, int tipo, String titulo) {
		this.fecha = fecha;
		this.tipo = tipo;
		this.titulo = titulo;
		this.duracion = duracion;
		this.idEntrada = contEntrada;
		Entradas.contEntrada++;
		
	}

	public Entradas() {
		this.idEntrada = contEntrada;
		Entradas.contEntrada++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duracion;
		/*long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));*/
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entradas other = (Entradas) obj;
		if (duracion != other.duracion)
			return false;
		/*if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;*/ //CJB
		return true;
	}

	@Override
	public int compareTo(Entradas o) {
		// TODO Auto-generated method stub
		if(o.idEntrada == this.idEntrada) {
			return 0;
		}else if (o.idEntrada<this.idEntrada)
		{
			return 1;
		}		
		return -1;
	}

	@Override
	public String toString() {
		return "ID Entrada: " + idEntrada + ", Fecha: " + fecha + ", Duracion: " + duracion + "Hs, Evento: "
				+ titulo;
	}

/*	public List<Eventos> getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(List<Eventos> listaEventos) {
		this.listaEventos = listaEventos;
	}*/

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
