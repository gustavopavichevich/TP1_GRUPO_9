package resolucion;

import java.util.Iterator;
import java.util.TreeSet;

public class ejercicio2 {

	public static void main(String[] args) {
		//iniciado por pablo macial
		TreeSet<entradas> listaEntradas= new TreeSet<entradas>();
		
		
		entradas e1 = new entradas("German", "Medina", 55555555,"pintos","masculino","Jose c Paz","buenos aires");
		entradas e2 = new entradas("Cristian", "Benitez", 66666666,"hernandez","Masculino","san miguel","buenos aires");
		entradas e3 = new entradas("Leonardo", "Yermoli", 77777777,"arenales","masculino","san miguel","buenos aires");
		entradas e4 = new entradas("Gustavo", "Pavichevich",8888888,"campos","masculino","moreno","buenos aires");
		entradas e5 = new entradas("Pablo", "Maciel", 99999999,"Bulnes","masculino","Jose c Paz","buenos aires");
		
		listaEntradas.add(e1);
		listaEntradas.add(e2);
		listaEntradas.add(e3);
		listaEntradas.add(e4);
		listaEntradas.add(e5);
		
		


		

		System.out.println("Listado de entradas iterador ordenado \n");
		
		Iterator<entradas> it = listaEntradas.iterator();
		while(it.hasNext())
		{
			entradas p = (entradas) it.next();
			System.out.println(p.toString());
		}
	}

}
