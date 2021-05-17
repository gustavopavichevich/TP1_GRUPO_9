package entity;

import java.time.LocalDate;

public class EntradaInfantil extends Entradas {

	private double precio;
	private int edad;

	private final double precioMenor = 250.0;
	private final double precioMayor = 500.0;

	public EntradaInfantil(int edad, LocalDate fecha, int duracion) {
		super();
		if (edad < 8) {
			this.precio = precioMenor;
		} else {
			this.precio = precioMayor;
		}
		super.setFecha(fecha);
		super.setDuracion(duracion);
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public double getPrecio() {
		return precio;
	}

	// TODO: ESTA IMPLEMENTACIÓN NO DEBERIA ESTAR ACA
	@Override
	public double bonificaCorporativo(int cantInvitados) {
		// TODO Auto-generated method stub
		return 0;
	}

}
