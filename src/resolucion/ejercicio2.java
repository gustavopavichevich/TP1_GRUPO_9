package resolucion;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

import entity.Entradas;

public class ejercicio2 {

	public static void main(String[] args) {

		Date fecha = new Date();
		// iniciado por pablo macial
		TreeSet<Entradas> listaEntradas = new TreeSet<Entradas>();

		Entradas e1 = new Entradas("La Renga", 500.0, fecha, 3);
		Entradas e2 = new Entradas("Piñon Fijo", 200.0, fecha, 2);
		Entradas e3 = new Entradas("Racing-Independiente", 380.0, fecha, 2);
		Entradas e4 = new Entradas("Stravaganza", 500.0, fecha, 4);
		Entradas e5 = new Entradas("Topa", 200.0, fecha, 2);

		// Clientes c1 = new Clientes("German", "Medina",
		// 55555555,"pintos","masculino","Jose c Paz","buenos aires");
		// Clientes c2 = new Clientes("Cristian", "Benitez",
		// 66666666,"hernandez","Masculino","san miguel","buenos aires");
		// Clientes c3 = new Clientes("Leonardo", "Yermoli",
		// 77777777,"arenales","masculino","san miguel","buenos aires");
		// Clientes c4 = new Clientes("Gustavo",
		// "Pavichevich",8888888,"campos","masculino","moreno","buenos aires");
		// Clientes c5 = new Clientes("Pablo", "Maciel",
		// 99999999,"Bulnes","masculino","Jose c Paz","buenos aires");

		listaEntradas.add(e1);
		listaEntradas.add(e2);
		listaEntradas.add(e3);
		listaEntradas.add(e4);
		listaEntradas.add(e5);

		System.out.println("Listado de entradas iterador ordenado \n");

		Iterator<Entradas> it = listaEntradas.iterator();
		while (it.hasNext()) {
			Entradas p = (Entradas) it.next();
			System.out.println(p.toString());
		}

		// punto C

		TreeSet<Entradas> listaEntradas1 = new TreeSet<Entradas>();

		Entradas e21 = new Entradas("La Renga", 500.0, fecha, 3);
		Entradas e22 = new Entradas("Piñon Fijo", 200.0, fecha, 2);
		Entradas e23 = new Entradas("Racing-Independiente", 380.0, fecha, 2);
		Entradas e24 = new Entradas("Stravaganza", 500.0, fecha, 4);
		Entradas e25 = new Entradas("Topa", 200.0, fecha, 2);

		listaEntradas1.add(e21);
		listaEntradas1.add(e22);
		listaEntradas1.add(e23);
		listaEntradas1.add(e24);
		listaEntradas1.add(e25);

		System.out.println("\n");
		
		if (e1.equals(e21)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}

		
		System.out.println("Listado de entradas iterador ordenado \n");

		Iterator<Entradas> iterador = listaEntradas1.iterator();
		while (iterador.hasNext()) {
			Entradas p = (Entradas) iterador.next();
			System.out.println(p.toString());
		}

	}

}
