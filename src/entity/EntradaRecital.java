package entity;

public class EntradaRecital extends Entradas {

	private double precio;
	private boolean vip;
	
	public EntradaRecital() {
		// TODO Auto-generated constructor stub
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
