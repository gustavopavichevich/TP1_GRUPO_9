package entity;

import entity.Eventos;

public class Infantiles extends Eventos {

	private boolean souvenir;
	private int edad;
	private final int[] valor = {250,500};

	// CONSTRUCTORES

	public Infantiles() {
		super();
		// TODO:ARREGLAR PRECIOS
		// if (edad < 8) {
		// super.setPrecio(precioMenores);
		// } else {
		// super.setPrecio(precioMayores);
		// }

	}

	public Infantiles(int edad) {
		super();
		this.edad = edad;
		if (edad < 8) {
			// TODO:TENEMOS QUE ARRIESGAR EL PRECIO
			// super.setPrecio(precioMenores);
			// }
			// {
			// super.setPrecio(precioMayores);
		}

	}

	// METODOS

	public boolean isSouvenir() {
		return souvenir;
	}

	public void setSouvenir(boolean souvenir) {
		this.souvenir = souvenir;
	}
	// TODO:TENEMOS QUE ARRIESGAR EL PRECIO
	//
	// @Override
	// public String toString() {
	// return "Infantil [Flag souvenir: " + souvenir + ", Edad: " + edad + ",
	// Precio: $" + super.getPrecio() + "]";
	// }
	//
	// public double bonificaCorporativo(int cantInvitados) {
	// if (cantInvitados > 20) {
	// return super.getPrecio() * 0.85;
	// }
	// return super.getPrecio();
	// }

	
	// TODO: ESTA IMPLEMENTACIÓN NO DEBERIA ESTAR ACA
	@Override
	public double bonificaCorporativo(int cantInvitados) {
		// TODO Auto-generated method stub
		return 0;
	}
}
