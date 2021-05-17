package main;

import java.time.LocalDate;
import java.util.ArrayList;

import entity.*;

public class Principal {

	public static void main(String[] args) {
		/*
		 
		
		Comento todo ya que esto es del TP1
		
		
		LocalDate fecha ;
		fecha=LocalDate.now();
		//declaracion de clientes
		Clientes p1 = new Clientes("Belen", "Sanchez", 11111111,"arenales","femenino","san miguel","buenos aires");
		Clientes p2 = new Clientes("Alberto", "Rodriguez", 22222222,"arenales","masculino","san miguel","buenos aires");
		Clientes p3 = new Clientes("Rodrigo", "Fernandez", 33333333,"arenales","masculino","san miguel","buenos aires");
		Clientes p4 = new Clientes("Pedro", "Ibañez", 444444444,"arenales","masculino","san miguel","buenos aires");
		Clientes p5= new Clientes("Mariano", "Martinez", 555555,"arenales","homosexual","san miguel","buenos aires");
		
		//venta entrada para deporte
		Deportes evDeporte = new Deportes(true,"Futbol");
		evDeporte.setDuracion(2);
		evDeporte.setIdEvento(1);
		evDeporte.setFecha(fecha);
		evDeporte.setTitulo("Boca vs River");
		EntradaDeporte entradaDeporte= new EntradaDeporte("Futbol",evDeporte.getFecha(), evDeporte.getDuracion());

		//venta entrada para evento infantil
		Eventos evInfantil = new Infantiles(4);
		evInfantil.setDuracion(2);
		evInfantil.setIdEvento(1);
		evInfantil.setFecha(fecha);
		evInfantil.setTitulo("Cumpleaños Gabriel");
		EntradaInfantil entradaInfantil= new EntradaInfantil(evInfantil.GetPrecio(),evInfantil.getFecha(), evInfantil.getDuracion());
		
		//venta entrada para evento teatro
		GeneroTeatro gen2 = new GeneroTeatro("drama");
		Actores actor1 = new Actores("Ricardo","Darin");
		Actores actor2 = new Actores("Francella","Guillermo");
		Actores actor3 = new Actores("Minujin","Juan");
		Eventos evTeatro = new Teatros(gen2,actor1,actor2,actor3,1);
		evTeatro.setDuracion(2);
		evTeatro.setIdEvento(1);
		evTeatro.setFecha(fecha);
		evTeatro.setTitulo("Romeo y Julieta");
		EntradaTeatro entradaTeatro= new EntradaTeatro(evTeatro.GetPrecio(),evTeatro.getFecha(), evTeatro.getDuracion());
		//venta entrada para evento recital
		GeneroRecital gen = new GeneroRecital("rock");
		Bandas ban1 = new Bandas();
		Bandas ban2 = new Bandas();
		Bandas ban3 = new Bandas();
		
		ban1.setNombre("Metallica");
		ban2.setNombre("La Vela Puerca");
		ban3.setNombre("NTVG");
		
		Eventos evRecital = new Recitales(true,gen,ban1,ban2,ban3,0);
		evRecital.setDuracion(2);
		evRecital.setIdEvento(1);
		evRecital.setFecha(fecha);
		evRecital.setTitulo("Concierto de Rock");
		EntradaRecital entradaRecital = new EntradaRecital(evRecital.GetPrecio(),evRecital.getFecha(), evRecital.getDuracion());
		
		
		ArrayList<Entradas> listaEntradas = new ArrayList<Entradas>();
		listaEntradas.add(entradaDeporte);
		listaEntradas.add(entradaInfantil);
		listaEntradas.add(entradaTeatro);
		listaEntradas.add(entradaRecital);
		double montototal=entradaDeporte.getPrecio()+entradaInfantil.getPrecio()+entradaTeatro.getPrecio()+entradaRecital.getPrecio();
		ventaEntradas venta1 = new ventaEntradas(fecha, p1,listaEntradas,montototal);
		
		
		/*
		GeneroRecital gen = new GeneroRecital("rock");
		Bandas ban1 = new Bandas();
		Bandas ban2 = new Bandas();
		Bandas ban3 = new Bandas();
		
		ban1.setNombre("Metallica");
		ban2.setNombre("La Vela Puerca");
		ban3.setNombre("NTVG");
		
		Recitales evRecital = new Recitales(true,gen,ban1,ban2,ban3,0, fecha);
		System.out.println(evRecital.toString());
		
		System.out.println(" ");		
		
		System.out.println(evDeporte.toString());
		System.out.println(" ");
		
		Eventos prueba = new Infantiles(4);
		System.out.println(prueba.toString());
		System.out.println(" ");
		
		GeneroTeatro gen2 = new GeneroTeatro("drama");
		Actores actor1 = new Actores("Ricardo","Darin");
		Actores actor2 = new Actores("Francella","Guillermo");
		Actores actor3 = new Actores("Minujin","Juan");
		
		Teatros pruebat = new Teatros(gen2,actor1,actor2,actor3,1);
		System.out.println(pruebat.toString());
		System.out.println(" ");
		System.out.println("Prueba de INTERFAZ ConsultaGenero de IGENEROSDAO para Teatro: "+ pruebat.consultarGenero());
		System.out.println(" ");
		System.out.println("Prueba de INTERFAZ ConsultaGenero de IGENEROSDAO de para Recital: "+ evRecital.consultarGenero());
		System.out.println(" ");
		System.out.println("Prueba de INTERFAZ ConsultarDatosEntrada de IENTRADA para Recital: "+ evRecital.ConsultarDatosEntrada());
		*/
	}
}
