package main;

import entity.Evento;
import entity.Show;
import util.Gestion;

public class Principal {

	public static void main(String[] args) {
		Gestion gestion = new Gestion();
		Show show = new Show();
		Evento evento = new Evento();
		//
		if (gestion.existeShow(show)) {
			show.setEvento(evento);
			gestion.setShow(show);
		}
		
	}
}
