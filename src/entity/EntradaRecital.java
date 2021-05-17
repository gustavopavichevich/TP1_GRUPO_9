package entity;

import java.time.LocalDate;

public class EntradaRecital extends Entradas {

	private double precio;
	private boolean vip;
	
	public EntradaRecital() {
		// TODO Auto-generated constructor stub
	}
	public EntradaRecital(boolean vip,LocalDate fecha, int duracion) {
		this.vip = vip;
		super.setFecha(fecha);
		super.setDuracion(duracion);
		if(vip) {
			this.precio = 1500.0;
		}else {
			this.precio= 800.0;
		}
	}
	
	
	
	public double getPrecio() {
		return precio;
	}



	public void setPrecio() {
		if(this.vip) {
			this.precio = 1500.0;
		}else {
			this.precio= 800.0;
		}
			
	}



	public boolean isVip() {
		return vip;
	}



	public void setVip(boolean vip) {
		this.vip = vip;
	}



	// TODO: ESTA IMPLEMENTACIÓN NO DEBERIA ESTAR ACA
	@Override
	public double bonificaCorporativo(int cantInvitados) {
		// TODO Auto-generated method stub
		return 0;
	}

}
