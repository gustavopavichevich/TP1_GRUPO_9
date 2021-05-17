package entity;

import entity.Eventos;

public class Infantiles extends Eventos {

	private boolean souvenir;
	private int edad;

	// CONSTRUCTORES

	public Infantiles() {
		super();
	}

	public Infantiles(int edad) {
		super();
		this.edad = edad;
	}
	
	public Infantiles(int edad, boolean souv) {
		super();
		this.souvenir = souv;
		this.edad = edad;
	}

	// METODOS

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isSouvenir() {
		return souvenir;
	}

	public void setSouvenir(boolean souvenir) {
		this.souvenir = souvenir;
	}

	@Override
	public String toString() {
		return "Infantil [Flag souvenir: " + souvenir + ", Edad: " + edad + "]";
	}

	@Override
	public double bonificaCorporativo(int cantInvitados) {
		// TODO Auto-generated method stub
		return 0;
	}

}
