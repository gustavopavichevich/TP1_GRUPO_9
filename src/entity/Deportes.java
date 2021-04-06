package entity;

import java.util.Arrays;

import entity.Eventos;

public class Deportes extends Eventos {
	
	private final String[] tipoDeportes = {"Futbol","Rugby","Hockey"};
	private final int[] precioDeportes = {300,450,380};
	private final double recargo = 1.3;
	private String tipodeporte;
	private boolean internacional;
	//private static int cont = 0;

	// CONSTRUCTORES

	public Deportes() {
		super();
	}

	public Deportes(boolean internacional, String tipo) {
		super();
		this.internacional = internacional;
		for(int i=0; i< tipoDeportes.length;i++) {
			if(tipo==tipoDeportes[i]) {
				this.tipodeporte = tipo;
				super.setPrecio(precioDeportes[i]);
			}
		}
		
		//este control se puede borrar si en la entrada de datos filtramos que ingrese solo uno de esos 3
		if(this.tipodeporte=="") {System.out.println("Tipo deporte incorrecto");}
		
		if(this.internacional) {
			super.setPrecio(super.getPrecio()*this.recargo);
		}
		
	}

	// METODOS

	public String getTipodeporte() {
		return tipodeporte;
	}

	/*public void setTipodeporte(String tipodeporte) {
		this.tipodeporte = tipodeporte;
	}*/// # se comenta para que solo se pueda setear por constructor

	public boolean isInternacional() {
		return internacional;
	}

	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

	/*public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Deportes.cont = cont;
	}*/

	@Override
	public String toString() {
		return "Deportes [" + "Tipo de deporte: " + tipodeporte + ", Flag internacional: " + internacional
				 + " ID Entrada: "+ super.getidEntrada()+ "   " +"Duracion: " + super.getDuracion() 
				+ "  Precio: $" + super.getPrecio() + "]";
	}

}
