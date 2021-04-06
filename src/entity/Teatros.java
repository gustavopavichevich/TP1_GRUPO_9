
package entity;

import dao.IGenerosDAO;

public class Teatros extends Eventos implements IGenerosDAO{

	private Generos genero;
	private Actores actores;
	private int cantactores;
	//private static int cont = 0;


	// CONSTRUCTOR

	public Teatros() {
		super();
	}

	public Actores getActores() {
		return actores;
	}

	public void setActores(Actores actores) {
		this.actores = actores;
	}

	public Teatros(String generoteatro,Actores actores, int cantactores) {
		super();
		//this.setGenero(generoteatro);
		this.setCantactores(cantactores);
		this.setActores(actores);

	}

	// METODOS

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	
	
	
	public int getCantactores() {
		return cantactores;
	}

	public void setCantactores(int cantactores) {
		this.cantactores = cantactores;
	}

	/*public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Teatros.cont = cont;
	}*/

	@Override
	public Generos consultarGenero() {
		// TODO Auto-generated method stub
		return this.genero;
	}

	@Override
	public String toString() {
		return "Teatro [Genero: " + genero + ", Cant. de actores: " + cantactores + "]";
	}
	

}
