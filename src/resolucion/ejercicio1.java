package resolucion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import entity.Actores;
import entity.Bandas;
import entity.Clientes;
import entity.Deportes;
import entity.EntradaDeporte;
import entity.EntradaInfantil;
import entity.EntradaRecital;
import entity.EntradaTeatro;
import entity.Entradas;
import entity.Eventos;
import entity.GeneroRecital;
import entity.GeneroTeatro;
import entity.Infantiles;
import entity.Recitales;
import entity.Teatros;
import entity.ventaEntradas;

public class ejercicio1 {

	public static void main(String[] args) {
		LocalDate fecha ;
		fecha=LocalDate.now();
		//declaracion de clientes
		Clientes p1 = new Clientes("Belen", "Sanchez", 11111111,"arenales","femenino","san miguel","buenos aires");
		Clientes p2 = new Clientes("Alberto", "Rodriguez", 22222222,"arenales","masculino","san miguel","buenos aires");
		Clientes p3 = new Clientes("Rodrigo", "Fernandez", 33333333,"arenales","masculino","san miguel","buenos aires");
		Clientes p4 = new Clientes("Pedro", "Ibañez", 444444444,"arenales","masculino","san miguel","buenos aires");
		Clientes p5 = new Clientes("Mariano", "Martinez", 555555,"arenales","homosexual","san miguel","buenos aires");
		
		//venta entrada para deporte
		Deportes evDeporte = new Deportes(true,"Futbol");
		evDeporte.setDuracion(2);
		evDeporte.setIdEvento(1);
		evDeporte.setFecha(fecha);
		evDeporte.setTitulo("Boca vs River");
		Entradas entradaDeporte= new EntradaDeporte(evDeporte.getTipodeporte(),evDeporte.getFecha(), evDeporte.getDuracion(), false);

		//venta entrada para evento infantil
		Eventos evInfantil = new Infantiles(4);
		evInfantil.setDuracion(2);
		evInfantil.setIdEvento(1);
		evInfantil.setFecha(fecha);
		evInfantil.setTitulo("Cumpleaños Gabriel");
		Entradas entradaInfantil= new EntradaInfantil(4, evInfantil.getFecha(), evInfantil.getDuracion());
		
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
		Entradas entradaTeatro= new EntradaTeatro(evTeatro.GetPrecio(),evTeatro.getFecha(), evTeatro.getDuracion());
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
		Entradas entradaRecital = new EntradaRecital(evRecital.GetPrecio(),evRecital.getFecha(), evRecital.getDuracion());
		
		
		ArrayList<Entradas> listaEntradas = new ArrayList<Entradas>();
		listaEntradas.add(entradaDeporte);
		listaEntradas.add(entradaInfantil);
		listaEntradas.add(entradaTeatro);
		listaEntradas.add(entradaRecital);
		double montototal=entradaDeporte.getPrecio()+entradaInfantil.getPrecio()+entradaTeatro.getPrecio()+entradaRecital.getPrecio());
		ventaEntradas venta1 = new ventaEntradas(fecha, p1,listaEntradas,montototal);
		
	
		ArrayList<Clientes> listaClientes = new ArrayList<Clientes>();
		listaClientes.add(p1);
		listaClientes.add(p2);
		listaClientes.add(p3);
		listaClientes.add(p4);
		listaClientes.add(p5);
		
		ArrayList<Entradas> listaEntradas = new ArrayList<Entradas>();
		listaEntradas.add(e1);
		listaEntradas.add(e2);
		listaEntradas.add(e3);
		listaEntradas.add(e4);
		listaEntradas.add(e5);
		
		ArrayList<Entradas> listaEntradas2 = new ArrayList<Entradas>();
		listaEntradas2.add(e30);
		listaEntradas2.add(e31);
		listaEntradas2.add(e34);
		
		System.out.println("Listado de entradas \n");		
		Iterator<Entradas> it = listaEntradas.iterator();
		while(it.hasNext())
		{
			Entradas e = (Entradas) it.next();
			montoTotal += e.getPrecio();
			System.out.println(e.toString());
		}
		
		ventaEntradas venta1 = new ventaEntradas(fecha, p1,listaEntradas, montoTotal);
		
		//Impresion de los dos objetos ventaEntrada
		System.out.println("Listado de venta de entradas \n");	
				System.out.println(venta1.toString() );
				
		montoTotal=0;
		
		Iterator<Entradas> itDos = listaEntradas2.iterator();
		while(itDos.hasNext())
		{
			Entradas e = (Entradas) itDos.next();
			montoTotal += e.getPrecio();
		}
				
		ventaEntradas venta2 = new ventaEntradas(fecha, p2,listaEntradas2, montoTotal);
		
		//Impresion de los dos objetos ventaEntrada
		System.out.println(venta2.toString() );
		
		
	}
}
