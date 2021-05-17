package entity;

public class EntradaInfantil extends Entradas{

	private double precio;
	private int edad;
	private final double precioMenor= 250.0;
	private final double precioMayor= 500.0;
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio() {
		 if (this.edad < 8) {
			 this.precio = precioMenor;
		 } else {
		 	this.precio=precioMayor;
		 }
	}

	public EntradaInfantil() {
		// TODO Auto-generated constructor stub
	}
	
	// TODO: ESTA IMPLEMENTACIÓN NO DEBERIA ESTAR ACA
	@Override
	public double bonificaCorporativo(int cantInvitados) {
		// TODO Auto-generated method stub
		return 0;
	}

}
