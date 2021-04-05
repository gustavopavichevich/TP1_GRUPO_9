package util;

import entity.Show;

public class Gestion {
	private Show show;
	
	// CONSTRUCTORES
	public Gestion() {
		//PruebaGit
	}

	public Gestion(Show show) {
		this.show = show;
	}

	// METODOS
	
	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}
	
	public boolean existeShow(Show show) {
		//definir el control para saber si existe un show
		//minima validación
		return true;
	}
}
