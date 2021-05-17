package entity;

import java.time.LocalDate;

public class EntradaDeporte extends Entradas {

	private double precio;
	private boolean esInternacional;
	private String tipoDeporte;
	private final double precioFutbol = 300.0;
	private final double precioHockey = 380.0;
	private final double precioRugby = 450.0;
	private final double recargo = 1.3;

	public EntradaDeporte(String tipoDeporte,LocalDate fecha, int duracion, boolean esInternacional) {
		super();
		if (this.tipoDeporte == "Futbol") {
			this.precio = precioFutbol;
		} else if (this.tipoDeporte == "Hockey") {
			this.precio = precioHockey;
		} else {
			this.precio = precioRugby;
		}
		if (esInternacional)
			this.precio *= recargo;
		super.setFecha(fecha);
		super.setDuracion(duracion);
	}

	public double getPrecio() {
		return precio;
	}

	public boolean isEsInternacional() {
		return esInternacional;
	}


	public String getTipoDeporte() {
		return tipoDeporte;
	}


	// TODO: ESTA IMPLEMENTACIÓN NO DEBERIA ESTAR ACA
	@Override
	public double bonificaCorporativo(int cantInvitados) {
		// TODO Auto-generated method stub
		return 0;
	}

}
