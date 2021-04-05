
package entity;

import dao.IGeneroDAO;

public class Teatro extends Evento implements IGeneroDAO{

	private Genero genero;
	private int cantactores;
	private static int cont = 0;


	// CONSTRUCTOR

	public Teatro() {
		super();
	}

	public Teatro(String generoteatro, int cantactores) {
		super();
		this.setCantactores(cantactores);

	}

	// METODOS

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getCantactores() {
		return cantactores;
	}

	public void setCantactores(int cantactores) {
		this.cantactores = cantactores;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Teatro.cont = cont;
	}

	@Override
	public Genero consultarGenero() {
		// TODO Auto-generated method stub
		return this.genero;
	}

	@Override
	public String toString() {
		return "Teatro [genero=" + genero + ", cantactores=" + cantactores + "]";
	}
	

}
