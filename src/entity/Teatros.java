
package entity;

import dao.IGenerosDAO;

public class Teatros extends Eventos implements IGenerosDAO {

	private GeneroTeatro genero;
	private Actores actor1;
	private Actores actor2;
	private Actores actor3;
	private int cantactores;

	// CONSTRUCTORES

	public Teatros() {
		super();
	}

	public Teatros(GeneroTeatro genero, Actores actor1, Actores actor2, Actores actor3, int cantactores) {
		super();
		this.genero = genero;
		this.actor1 = actor1;
		this.actor2 = actor2;
		this.actor3 = actor3;
		this.cantactores = cantactores;
	}

	public Teatros(String generoteatro, Actores actores, int cantactores) {
		super();
		this.setCantactores(cantactores);
		this.setActor1(actores);
	}

	// METODOS

	public Actores getActor1() {
		return actor1;
	}

	public void setActor1(Actores actor) {
		this.actor1 = actor;
	}
	
	public Actores getActor2() {
		return actor2;
	}

	public void setActor2(Actores actores2) {
		this.actor2 = actores2;
	}

	public Actores getActor3() {
		return actor3;
	}

	public void setActor3(Actores actores3) {
		this.actor3 = actores3;
	}

	public GeneroTeatro getGenero() {
		return genero;
	}

	public void setGenero(GeneroTeatro genero) {
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
		return "Teatros [genero=" + this.genero.getDescripcion() + ", actor1=" + actor1 + ", actor2=" + actor2 + ", actor3=" + actor3
				+ ", cantactores=" + cantactores + "]";
	}
	// TODO: QUE HACEMOS CON EL PRECIO
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
