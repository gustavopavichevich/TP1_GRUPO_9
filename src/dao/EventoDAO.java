package dao;

import entity.Evento;

public class EventoDAO {
	private Evento[] evento = new Evento[4];

	public EventoDAO() {
//		evento[0].setIdEvento(); #pavi: acá debería poner todos los datos que menciona la 
//								fotocopia sobre los eventos
	}

	public Evento[] getEvento() {
		return evento;
	}

	public void setEvento(Evento[] evento) {
		this.evento = evento;
	}

}
