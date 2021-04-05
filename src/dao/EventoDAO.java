package dao;

import java.util.Arrays;
import java.util.Date;

import entity.Evento;

public class EventoDAO {
	private Evento[] evento = new Evento[4];
	Date fecha = new Date();
	public EventoDAO() {
		evento[0].setIdEvento(0);
		evento[0].setTipoEvento("Recital");
//		evento[0];
		evento[0].setDuracion(12);
		evento[0].setFecha(fecha);
		//evento.setIdentrada();
		evento[0].setTipoEntrada("CUAL ES LA DIFERENCIA CON TIPO DE EVENTO??");
		evento[0].setTipoEvento("Recital");
		evento[0].setTitulo("LPDA EN LUNA PARK");
		evento[0].setValor(50);
		evento[1].setIdEvento(0);
		evento[1].setTipoEvento("Recital");
//		evento[];
		evento[1].setDuracion(12);
		evento[1].setFecha(fecha);
		//evento.setIdentrada();
		evento[1].setTipoEntrada("CUAL ES LA DIFERENCIA CON TIPO DE EVENTO??");
		evento[1].setTipoEvento("Recital");
		evento[1].setTitulo("MARAMA EN LUNA PARK");
		evento[1].setValor(50);
		
		evento[2].setIdEvento(0);
		evento[2].setTipoEvento("Teatro");
//		evento[];
		evento[2].setDuracion(12);
		evento[2].setFecha(fecha);
		//evento.setIdentrada();
		evento[2].setTipoEntrada("CUAL ES LA DIFERENCIA CON TIPO DE EVENTO??");
		evento[2].setTipoEvento("Teatro");
		evento[2].setTitulo("Monologos");
		evento[2].setValor(50);
		
		evento[3].setIdEvento(0);
		evento[3].setTipoEvento("Teatro");
//		evento[];
		evento[3].setDuracion(12);
		evento[3].setFecha(fecha);
		//evento.setIdentrada();
		evento[3].setTipoEntrada("CUAL ES LA DIFERENCIA CON TIPO DE EVENTO??");
		evento[3].setTipoEvento("Teatro");
		evento[3].setTitulo("otra obra");
		evento[3].setValor(50);
		
	}

	public Evento[] getEvento() {
		return evento;
	}

	public void setEvento(Evento[] evento) {
		this.evento = evento;
	}

	@Override
	public String toString() {
		return "EventoDAO [evento=" + Arrays.toString(evento) + ", fecha=" + fecha + "]";
	}

}
