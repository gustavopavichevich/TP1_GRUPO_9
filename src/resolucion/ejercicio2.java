package resolucion;

import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

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

public class ejercicio2 {

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
		ban1.setNombre("Abel Pintos");
		ban2.setNombre("Luis Miguel");
		ban3.setNombre("Ricky Martin");
		
		//Generacion de clientes
		Clientes p1 = new Clientes("Veronica", "Sanchez", 11111111,"arenales","femenino","san miguel","buenos aires");
		Clientes p2 = new Clientes("Jorge", "Rodriguez", 22222222,"arenales","masculino","san miguel","buenos aires");
		Clientes p3 = new Clientes("Aldo", "Fernandez", 33333333,"arenales","masculino","san miguel","buenos aires");
		Clientes p4 = new Clientes("Martin", "Ibañez", 444444444,"arenales","masculino","san miguel","buenos aires");
		Clientes p5 = new Clientes("Esteban", "Quito", 555555,"arenales","masculino","san miguel","buenos aires");
		
		//Generacion de stock de eventos para deportes
		Deportes evDeporte = new Deportes(true,"Futbol");
		evDeporte.setDuracion(4);
		evDeporte.setIdEvento(1);
		evDeporte.setFecha(fecha.plusDays(380));
		evDeporte.setTitulo("Racing vs Independiente");

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
		EntradaInfantil entradaInfantilMenor= new EntradaInfantil(4, evInfantil.getFecha(), evInfantil.getDuracion(),2,evInfantil.getTitulo());	
		EntradaTeatro entradaTeatro= new EntradaTeatro(evTeatro.getFecha(), evTeatro.getDuracion(),1,evTeatro.getTitulo());
		EntradaRecital entradaRecital = new EntradaRecital(evRecital.isVip(),evRecital.getFecha(), evRecital.getDuracion(),3,evRecital.getTitulo());
		EntradaInfantil entradaInfantilMayor= new EntradaInfantil(34, evInfantil.getFecha(), evInfantil.getDuracion(),2,evInfantil.getTitulo());
		EntradaRecital entradaRecitalCopia = new EntradaRecital(evRecital.isVip(),evRecital.getFecha(), evRecital.getDuracion(),3,evRecital.getTitulo());
		
		TreeSet<Eventos> listaEntradas = new TreeSet<Eventos>();
		
		listaEntradas.add(entradaDeporte);
		listaEntradas.add(entradaInfantilMenor);
		listaEntradas.add(entradaTeatro);
		listaEntradas.add(entradaRecital);
		listaEntradas.add(entradaInfantilMayor);
		
		//Calculo del total a pagar
		
		double montoTotal=entradaDeporte.getPrecio() + entradaInfantilMenor.getPrecio()+entradaTeatro.getPrecio()+entradaRecital.getPrecio()+ entradaInfantilMayor.getPrecio();
		
		// PRueba de una venta total para un cliente
		ventaEntradas venta2 = new ventaEntradas(fecha, p5,listaEntradas, montoTotal);
		
		//Impresion de los dos objetos ventaEntrada
		System.out.println("Datos de la venta \n");	
		System.out.println(venta2.toString() );
				
		//Recorrido de la lista de entradas adquiridas PUNTO 2 DEL TP
		System.out.println(" \n");	
		System.out.println("Entradas adquiridas \n");		
		Iterator<Eventos> it = listaEntradas.iterator();
		while(it.hasNext())
		{
			Entradas e = (Entradas) it.next();
			System.out.println(e.toString());
		}
		
		// PUNTO C DEL TP
		System.out.println(" \n");	
		System.out.println("Comparacion de Entradas: \n");	
		if (entradaRecital.equals(entradaRecitalCopia)) {
			System.out.println("\t Son iguales");
		} else {
			System.out.println("\t No son iguales");
		}
				
	}

}
