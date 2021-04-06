package entity;

import entity.Eventos;

public class Deportes extends Eventos {

	private final String[] tipoDeportes = { "Futbol", "Rugby", "Hockey" };
	private final int[] precioDeportes = { 300, 450, 380 };
	private final double recargo = 1.3;
	private String tipodeporte;
	private boolean internacional;

	// CONSTRUCTORES

	public Deportes() {
		super();
	}

	public Deportes(boolean internacional, String tipo) {
		super();
		this.internacional = internacional;
		for (int i = 0; i < tipoDeportes.length; i++) {
			if (tipo == tipoDeportes[i]) {
				this.tipodeporte = tipo;
				super.setPrecio(precioDeportes[i]);
			}
		}

		if (this.tipodeporte == "") {
			System.out.println("Tipo deporte incorrecto");
		}

		if (this.internacional) {
			super.setPrecio(super.getPrecio() * this.recargo);
		}

	}

	// METODOS

	public String getTipodeporte() {
		return tipodeporte;
	}

	public boolean isInternacional() {
		return internacional;
	}

	public void setInternacional(boolean internacional) {
		this.internacional = internacional;
	}

	@Override
	public String toString() {
		return "Deportes [" + "Tipo de deporte: " + tipodeporte + ", Flag internacional: " + internacional
				+ " ID Entrada: " + super.getidEntrada() + "   " + "Duracion: " + super.getDuracion() + "  Precio: $"
				+ super.getPrecio() + "]";
	}

	public double bonificaCorporativo(int cantInvitados) {
		if (cantInvitados > 20) {
			return super.getPrecio() * 0.85;
		}
		return super.getPrecio();
	}
}
