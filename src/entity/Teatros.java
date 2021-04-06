
package entity;

import dao.IGenerosDAO;

public class Teatros extends Eventos implements IGenerosDAO {

	private Generos genero;
	private Actores actores;
	private int cantactores;

	// CONSTRUCTORES

	public Teatros() {
		super();
	}

	public Teatros(Generos genero, Actores actores, int cantactores) {
		super();
		this.genero = genero;
		this.actores = actores;
		this.cantactores = cantactores;
	}

	public Teatros(String generoteatro, Actores actores, int cantactores) {
		super();
		this.setCantactores(cantactores);
		this.setActores(actores);
	}

	// METODOS

	public Actores getActores() {
		return actores;
	}

	public void setActores(Actores actores) {
		this.actores = actores;
	}

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

	@Override
	public String consultarGenero() {
		// TODO Auto-generated method stub
		return this.genero.getDescripcion();
	}

	@Override
	public String toString() {
		return "Teatros [Genero: " + genero.getDescripcion() + ", Actores: " + actores.getNombre() + " "
				+ actores.getApellido() + " , Cant. de actores: " + cantactores + "]";
	}

	public double bonificaCorporativo(int cantInvitados) {
		if (cantInvitados > 20) {
			return super.getPrecio() * 0.85;
		}
		return super.getPrecio();
	}
}
