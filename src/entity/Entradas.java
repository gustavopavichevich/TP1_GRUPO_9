package entity;

import java.util.Date;

public class Entradas implements Comparable<Entradas> {
	private String tipoEvento;
	private double precio;
	private Date fecha;
	private int duracion;
	private int idEntrada;
	private static int contEntrada = 0;

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Entradas(String tipoEvento, double precio, Date fecha, int duracion) {
		this.tipoEvento = tipoEvento;
		this.precio = precio;
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
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tipoEvento == null) ? 0 : tipoEvento.hashCode());
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
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (tipoEvento == null) {
			if (other.tipoEvento != null)
				return false;
		} else if (!tipoEvento.equals(other.tipoEvento))
			return false;
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
		return "Entradas [tipoEvento=" + tipoEvento + ", precio=" + precio + ", fecha=" + fecha + ", duracion="
				+ duracion + ", idEntrada=" + idEntrada + "]";
	}

}
