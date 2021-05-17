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
		
		
		// Datos necesarios para generar eventos y ventas
		
		// Generacion de actores
		Actores actor1 = new Actores("Ricardo","Darin");
		Actores actor2 = new Actores("Francella","Guillermo");
		Actores actor3 = new Actores("Minujin","Juan");
		
		// Generacion de generos para recitales
		GeneroRecital gen = new GeneroRecital("rock");
		
		// Generacion de generos para teatros
		GeneroTeatro gen2 = new GeneroTeatro("drama");
		
		// Generacion de bandas para recitales
		Bandas ban1 = new Bandas();
		Bandas ban2 = new Bandas();
		Bandas ban3 = new Bandas();
		ban1.setNombre("Metallica");
		ban2.setNombre("La Vela Puerca");
		ban3.setNombre("NTVG");
		
		//Generacion de clientes
		Clientes p1 = new Clientes("Belen", "Sanchez", 11111111,"arenales","femenino","san miguel","buenos aires");
		Clientes p2 = new Clientes("Alberto", "Rodriguez", 22222222,"arenales","masculino","san miguel","buenos aires");
		Clientes p3 = new Clientes("Rodrigo", "Fernandez", 33333333,"arenales","masculino","san miguel","buenos aires");
		Clientes p4 = new Clientes("Pedro", "Ibañez", 444444444,"arenales","masculino","san miguel","buenos aires");
		Clientes p5 = new Clientes("Mariano", "Martinez", 555555,"arenales","homosexual","san miguel","buenos aires");
		
		//Generacion de stock de eventos para deportes
		Deportes evDeporte = new Deportes(true,"Futbol");
		evDeporte.setDuracion(4);
		evDeporte.setIdEvento(1);
		evDeporte.setFecha(fecha.plusDays(380));
		evDeporte.setTitulo("Boca vs River");

		//Generacion de stock de eventos para infantiles
		Infantiles evInfantil = new Infantiles(4);
		evInfantil.setDuracion(2);
		evInfantil.setIdEvento(1);
		evInfantil.setFecha(fecha.plusDays(220));
		evInfantil.setTitulo("Cumpleaños Gabriel");
		
		//Generacion de stock de eventos para recitales
		Recitales evRecital = new Recitales(true,gen,ban1,ban2,ban3,0);
		evRecital.setDuracion(3);
		evRecital.setIdEvento(1);
		evRecital.setFecha(fecha.plusDays(120));
		evRecital.setTitulo("Concierto de Rock");
		
		//Generacion de stock de eventos para teatros
		Teatros evTeatro = new Teatros(gen2,actor1,actor2,actor3,1);
		evTeatro.setDuracion(7);
		evTeatro.setIdEvento(1);
		evTeatro.setFecha(fecha.plusDays(80));
		evTeatro.setTitulo("Romeo y Julieta");
		
		//0 Deportes 1Teatro 2infantiles 3recitales
		//Generacion de venta de entradas sueltas para eventos
		EntradaDeporte entradaDeporte= new EntradaDeporte(evDeporte.getTipodeporte(),evDeporte.getFecha(), evDeporte.getDuracion(), false,0, evDeporte.getTitulo());
		EntradaInfantil entradaInfantil= new EntradaInfantil(4, evInfantil.getFecha(), evInfantil.getDuracion(),2,evInfantil.getTitulo());	
		EntradaTeatro entradaTeatro= new EntradaTeatro(evTeatro.getFecha(), evTeatro.getDuracion(),1,evTeatro.getTitulo());
		EntradaRecital entradaRecital = new EntradaRecital(evRecital.isVip(),evRecital.getFecha(), evRecital.getDuracion(),3,evRecital.getTitulo());
		EntradaInfantil entradaInfantil2= new EntradaInfantil(34, evInfantil.getFecha(), evInfantil.getDuracion(),2,evInfantil.getTitulo());	
		
		//Generacion de la lista de entradas adquiridas

		ArrayList<Eventos> listaEntradas = new ArrayList<Eventos>();
		listaEntradas.add(entradaDeporte);
		listaEntradas.add(entradaInfantil);
		listaEntradas.add(entradaInfantil2);
		listaEntradas.add(entradaTeatro);
		listaEntradas.add(entradaRecital);
		
		//Calculo del total a pagar
		
		double montoTotal=entradaDeporte.getPrecio() + entradaInfantil.getPrecio()+entradaTeatro.getPrecio()+entradaRecital.getPrecio();
		
		// PRueba de una venta total para un cliente
		
		ventaEntradas venta1 = new ventaEntradas(fecha, p1,listaEntradas, montoTotal);
		
		//Impresion de los dos objetos ventaEntrada
		System.out.println("Datos de la venta \n");	
				System.out.println(venta1.toString() );
		
		//Recorrido de la lista de entradas adquiridas PUNTO 1 DEL TP
				
		System.out.println(" \n");	
		System.out.println("Entradas adquiridas \n");		
		Iterator<Eventos> it = listaEntradas.iterator();
		while(it.hasNext())
		{
			
			Entradas e = (Entradas) it.next();
			
	//		montoTotal += e.getPrecio();
			System.out.println(e.toString());
		
		}
	
		//System.out.println("\n");	
	
				
		
		
		//Generacion de la venta total con los datos completos de cliente, precios y entradas adquiridas		
		//double montototal=entradaDeporte.getPrecio() + entradaInfantil.getPrecio()+entradaTeatro.getPrecio()+entradaRecital.getPrecio();
	//	ventaEntradas venta1 = new ventaEntradas(fecha, p1,listaEntradas,montototal);
	/*	
	
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
		
		
		
		
		double montoTotal=0;
		ventaEntradas venta1 = new ventaEntradas(fecha, p1,listaEntradas, montoTotal);
		
		//Impresion de los dos objetos ventaEntrada
		System.out.println("Listado de venta de entradas \n");	
				System.out.println(venta1.toString() );
				
		/*montoTotal=0;
		
		Iterator<Entradas> itDos = listaEntradas2.iterator();
		while(itDos.hasNext())
		{
			Entradas e = (Entradas) itDos.next();
			montoTotal += e.getPrecio();
		}
				
		ventaEntradas venta2 = new ventaEntradas(fecha, p2,listaEntradas2, montoTotal);
		
		//Impresion de los dos objetos ventaEntrada
		System.out.println(venta2.toString() );
		
		*/
	}
}
