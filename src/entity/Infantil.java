package entity;

import entity.Evento;

public class Infantil extends Evento {

	private boolean souvenir;
	private int edad;
	private static int cont = 0;
	
	//Modif Leo
	private int precio;
	private final int precioMayores = 250;
	private final int  precioMenores = 500;

	// CONSTRUCTORES

	public Infantil() {
	super();
	if (edad < 8) {
		this.precio = precioMenores;
	}
	{
		this.precio = precioMayores;
	}

	}

	public Infantil(boolean souvenir, int edad) {
		super();
		this.souvenir = souvenir;
		this.edad = edad;
		if (edad < 8) {
			this.precio = precioMenores;
		}
		{
			this.precio = precioMayores;
		}

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

	@Override
	public String toString() {
		return "Infantil [souvenir=" + souvenir + ", edad=" + edad + ", precio=" + precio + ", precioMayores="
				+ precioMayores + ", precioMenores=" + precioMenores + "]";
	}
	
	

}
