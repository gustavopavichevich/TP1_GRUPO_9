package entity;

import java.time.LocalDate;
import java.util.List;

public abstract class Entradas extends Eventos implements Comparable<Entradas> {
	private int idEntrada;
	private static int contEntrada = 0;
	//private double precio; Los precios estan dentro de cada tipo de entrada. CJB
	private LocalDate fecha;
	private int duracion;
	private List<Eventos> listaEventos;

	/*public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}*/

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

	public Entradas(double precio, LocalDate fecha, int duracion) {
		//this.precio = precio;
		this.fecha = fecha;
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
		return "Entradas [fecha=" + fecha + ", duracion="
				+ duracion + ", idEntrada=" + idEntrada + "]";
	}//precio=" + precio + ", CJB

	public List<Eventos> getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(List<Eventos> listaEventos) {
		this.listaEventos = listaEventos;
	}

}
