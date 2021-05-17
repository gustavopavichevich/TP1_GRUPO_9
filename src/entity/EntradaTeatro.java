package entity;

import java.time.LocalDate;

public class EntradaTeatro extends Entradas{

	private final double precio=1350.5;
	
	public EntradaTeatro() {
		// TODO Auto-generated constructor stub
	}
	
	
	public EntradaTeatro(LocalDate fecha, int duracion) {
		
		super.setFecha(fecha);
		super.setDuracion(duracion);

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
