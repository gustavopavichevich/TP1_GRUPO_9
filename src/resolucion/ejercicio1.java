package resolucion;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import entity.Clientes;
import entity.Entradas;
import entity.ventaEntradas;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Date fecha = new Date();
		double montoTotal=0;
		
		//iniciado por german medina
		
		Clientes p1 = new Clientes(00001,"Belen", "Sanchez", 11111111,"arenales","femenino","san miguel","buenos aires");
		Clientes p2 = new Clientes(00002,"Alberto", "Rodriguez", 22222222,"arenales","femenino","san miguel","buenos aires");
		Clientes p3 = new Clientes(00003,"Rodrigo", "Fernandez", 33333333,"arenales","femenino","san miguel","buenos aires");
		Clientes p4 = new Clientes(00004,"Pedro", "Iba�ez", 444444444,"arenales","femenino","san miguel","buenos aires");
		Clientes p5= new Clientes(00005,"Mariano", "Martinez", 555555,"arenales","femenino","san miguel","buenos aires");
		
		Entradas e1= new Entradas("La Renga", 500.0, fecha, 3);
		Entradas e2= new Entradas("Piñon Fijo",200.0, fecha, 2);
		Entradas e3= new Entradas("Racing-Independiente",380.0, fecha, 2);
		Entradas e4= new Entradas("Stravaganza",500.0, fecha, 4);
		Entradas e5= new Entradas("Topa",200.0, fecha, 2);
		
		Entradas e30= new Entradas("LPDA", 500.0, fecha, 3);
		Entradas e31= new Entradas("Piñon Fijo",200.0, fecha, 2);
		Entradas e34= new Entradas("Topa",200.0, fecha, 2);
		
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
