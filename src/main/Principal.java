package main;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.EventoDAO;
import entity.Entrada;

import entity.Evento;
import entity.Infantil;
import entity.Show;
import util.Gestion;

public class Principal {

	public static void main(String[] args) {
		Gestion gestion = new Gestion();
		Show show = new Show();
		Evento evento = new Evento();
	//	EventoDAO DAO = new EventoDAO();
		
		Date fecha = new Date();
	//	SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
	
	//	System.out.println(DAO.toString());
	//System.out.println(fechaFormateada.format(fecha));
		
//
		
		
		
		
//		Infantil prueba = new Infantil();
	//	System.out.println(prueba.toString());
		
		
		
		
		
		
		
		
		
		
		
		
	show.setIdShow(4);
evento.setDuracion(12);
evento.setFecha(fecha);
//evento.setIdentrada();
evento.setIdEvento(1);
evento.setTipoEntrada("CUAL ES LA DIFERENCIA CON TIPO DE EVENTO??");
evento.setTipoEvento("Recital");
evento.setTitulo("LPDA EN LUNA PARK");
evento.setValor(50);
///
System.out.println("Datos del SHOW: " + show.toString());
//
System.out.println("");
//
System.out.println("Datos del EVENTO: " + evento.toString());
//
System.out.println("");
//
System.out.println("Datos de la ENTRADA: ");
System.out.println("Id de Entrada: "+ evento.getIdentrada());
System.out.println(("Tipo de entrada: "+ evento.getTipoEntrada()));
System.out.println(("Valor de entrada: "+ evento.getValor()));



//		evento.setFecha(fecha);
//		show.setEvento(evento);
//		
//		
//		
		
		
		
//		if (gestion.existeShow(show)) {
//			show.setEvento(evento);
//			gestion.setShow(show);
//		}
		
	}
}
