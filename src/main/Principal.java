package main;

import java.util.Date;

import entity.*;

public class Principal {

	public static void main(String[] args) {
		Eventos evDeporte = new Deportes(true,"Futbol");
		
		Date fecha = new Date();

		Generos gen = new Generos("rock", false);
		Bandas ban = new Bandas();
		ban.setNombre("Metallica");
		
		Recitales evRecital = new Recitales(true,gen,ban,0, fecha);
		System.out.println(evRecital.toString());
		
		System.out.println(" ");		
		
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
		System.out.println("Prueba de INTERFAZ ConsultaGenero de IGENEROSDAO para Teatro: "+ pruebat.consultarGenero());
		System.out.println(" ");
		System.out.println("Prueba de INTERFAZ ConsultaGenero de IGENEROSDAO de para Recital: "+ evRecital.consultarGenero());
		System.out.println(" ");
		System.out.println("Prueba de INTERFAZ ConsultarDatosEntrada de IENTRADA para Recital: "+ evRecital.ConsultarDatosEntrada());
	}
}
