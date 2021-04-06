package main;
import java.text.SimpleDateFormat;
import java.util.Date;

import entity.Actores;
import entity.Bandas;
import entity.Deportes;

//import dao.EventoDAO;
//import entity.Entrada;

import entity.Eventos;
import entity.Generos;
import entity.Infantiles;
//import entity.Show;
//import util.Gestion;
import entity.Recitales;
import entity.Teatros;

public class Principal {

	public static void main(String[] args) {
		//Gestion gestion = new Gestion();
		//Show show = new Show();
		Eventos evDeporte = new Deportes(true,"Futbol");
	//	EventoDAO DAO = new EventoDAO();
		
		Date fecha = new Date();
	//	SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
	
	//	System.out.println(DAO.toString());
	//System.out.println(fechaFormateada.format(fecha));
		
//
		//Inicio prueba german recitales
		//Me falta hacerlo andar, nose por que no me toma los string
		Generos gen = new Generos("rock", false);
		Bandas ban = new Bandas();
		ban.setNombre("Metallica");
		
		Recitales evRecital = new Recitales(true,gen,ban,0);
		System.out.println(evRecital.toString());
		
		System.out.println(" ");
		//Fin prueba german recitales
		
		
		System.out.println(evDeporte.toString());
		System.out.println(" ");
		
		
		Eventos prueba = new Infantiles(4);
		System.out.println(prueba.toString());
		System.out.println(" ");
		
		Generos gen2 = new Generos("drama", true);
		Actores actor = new Actores("Ricardo","Darin");
		
		Teatros pruebat = new Teatros(gen2,actor,1);
		System.out.println(pruebat.toString());
		System.out.println(" ");
		System.out.println("Prueba de INTERFAZ CONSULTAGENERO para Teatro: "+ pruebat.consultarGenero());
		System.out.println(" ");
		System.out.println("Prueba de INTERFAZ CONSULTAGENERO para Recital: "+ evRecital.consultarGenero());

		
		
		
		
		
	/*	
		
		
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

*/

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
