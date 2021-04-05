package entity;

import entity.Evento;

public class Infantil extends Evento {

	private boolean souvenir;
	private int edad;
	private static int cont = 0;

	// CONSTRUCTORES

	public Infantil() {
		super();
	}

	public Infantil(boolean souvenir, int edad) {
		super();
		this.souvenir = souvenir;
		this.edad = edad;

	}

	// METODOS

	public boolean isSouvenir() {
		return souvenir;
	}

	public void setSouvenir(boolean souvenir) {
		this.souvenir = souvenir;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Infantil.cont = cont;
	}

}
