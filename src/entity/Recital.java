package entity;

import entity.Evento;

public class Recital extends Evento {
	
	private boolean vip;
	public Genero genero;
	private int cantsoporte;
	
	
	
	public Recital()
	{
		super();
	}
	
	public Recital(boolean vip, String genero, int cantsoporte)
	{
		this.setGenero(genero);
	    this.vip=vip;
		this.cantsoporte=cantsoporte;
	}
	
	//gets y sets

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public String getGenero() {
		return this.genero.getDescripcion();
	}

	public void setGenero(String genero) {
		this.genero.setDescripcion(genero);
	}

	public int getCantsoporte() {
		return cantsoporte;
	}

	public void setCantsoporte(int cantsoporte) {
		this.cantsoporte = cantsoporte;
	}
	
	
	
	
	

}
