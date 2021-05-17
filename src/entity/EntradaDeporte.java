package entity;

public class EntradaDeporte extends Entradas {
	
	private double precio;
	private boolean esInternacional;
	private String tipoDeporte;
		private final double precioFutbol=300.0;
	private final double precioHockey=380.0;
	private final double precioRugby=450.0;
	private final double recargo = 1.3;
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio() {
		if(this.tipoDeporte == "Futbol") {
			this.precio= precioFutbol;
		}else if (this.tipoDeporte == "Hockey") {
			this.precio= precioHockey;
		}else {
			this.precio= precioRugby;
		}
		
		if(this.esInternacional)
			this.precio *= recargo;
	}

	public boolean isEsInternacional() {
		return esInternacional;
	}

	public void setEsInternacional(boolean esInternacional) {
		this.esInternacional = esInternacional;
	}

	public String getTipoDeporte() {
		return tipoDeporte;
	}

	public void setTipoDeporte(String tipoDeporte) {
		this.tipoDeporte = tipoDeporte;
	}
	public EntradaDeporte() {
		// TODO Auto-generated constructor stub
	}

	// TODO: ESTA IMPLEMENTACIÓN NO DEBERIA ESTAR ACA
	@Override
	public double bonificaCorporativo(int cantInvitados) {
		// TODO Auto-generated method stub
		return 0;
	}

}
