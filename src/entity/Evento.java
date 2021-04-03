package entity;

import entity.Entrada;

public class Evento extends Entrada {
	
	private int idevento;
	private String tipoevento;
	int precio;
	int tiempo;
	// agregar variable fecha????
	
	
	//constructores
	public Evento()
	{
		super();
	}
	
	public Evento(int idevento, String tipoevento, int precio, int tiempo)
	{
		this.idevento=idevento;
		this.tipoevento=tipoevento;
		this.precio=precio;
	    this.tiempo=tiempo;  
	    
	}
		
		
		
		public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

		public int getIdevento() {
			return idevento;
		}

		public void setIdevento(int idevento) {
			this.idevento = idevento;
		}

		public String getTipoevento() {
			return tipoevento;
		}

		public void setTipoevento(String tipoevento) {
			this.tipoevento = tipoevento;
		}

	
		
		
	

}
