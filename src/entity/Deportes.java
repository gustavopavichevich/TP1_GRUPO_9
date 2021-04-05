package entity;

import entity.Evento;

public class Deportes extends Evento {

	private String tipodeporte;
	private boolean internacional;
	private static int cont = 0;

	// CONSTRUCTORES

	public Deportes() {
		super();
	}

	public Deportes(boolean internacional, String tipodeporte) {
		super();
		this.internacional = internacional;
		this.tipodeporte = tipodeporte;
	}

	// METODOS

	public String getTipodeporte() {
		return tipodeporte;
	}

	public void setTipodeporte(String tipodeporte) {
		this.tipodeporte = tipodeporte;
	}

	public boolean isInternacional() {
		return internacional;
	}

	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Deportes.cont = cont;
	}

}
