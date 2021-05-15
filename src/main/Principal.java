package main;

import java.util.Date;

import entity.*;

public class Principal {

	public static void main(String[] args) {
		Eventos evDeporte = new Deportes(true,"Futbol");
		
		Date fecha = new Date();

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
	}
}
