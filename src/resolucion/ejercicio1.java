package resolucion;

import java.util.ArrayList;
import java.util.Iterator;

public class ejercicio1 {

	public static void main(String[] args) {
		// //iniciado por german medina
		entradas p1 = new entradas("Belen", "Sanchez", 11111111,"arenales","femenino","san miguel","buenos aires");
		entradas p2 = new entradas("Alberto", "Rodriguez", 22222222,"arenales","femenino","san miguel","buenos aires");
		entradas p3 = new entradas("Rodrigo", "Fernandez", 33333333,"arenales","femenino","san miguel","buenos aires");
		entradas p4 = new entradas("Pedro", "Iba�ez", 444444444,"arenales","femenino","san miguel","buenos aires");
		entradas p5= new entradas("Mariano", "Martinez", 555555,"arenales","femenino","san miguel","buenos aires");
		
		ArrayList<entradas> listaEntradas = new ArrayList<entradas>();
		listaEntradas.add(p1);
		listaEntradas.add(p1);
		listaEntradas.add(p2);
		listaEntradas.add(p3);
		listaEntradas.add(p4);
		listaEntradas.add(p5);
		
		System.out.println("Listado de entradas \n");		
		Iterator<entradas> it = listaEntradas.iterator();
		while(it.hasNext())
		{
			entradas p = (entradas) it.next();
			System.out.println(p.toString());
		}
	}

}
