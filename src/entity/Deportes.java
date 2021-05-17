package entity;

import entity.Eventos;

public class Deportes extends Eventos {

	private final String[] tipoDeportes = { "Futbol", "Rugby", "Hockey" };
	private String tipodeporte;


	// CONSTRUCTORES

	public Deportes() {
		super();
	}

	public Deportes(boolean internacional, String tipo) {
		super();
//		this.internacional = internacional;
//		for (int i = 0; i < tipoDeportes.length; i++) {
//			if (tipo == tipoDeportes[i]) {
//				this.tipodeporte = tipo;
//				// this.precioDeportes[i];
//			}
//		}
//
//		if (this.tipodeporte == "") {
//			System.out.println("Tipo deporte incorrecto");
//		}
		// TODO: ARREGLAR ESTO
		// if (this.internacional) {
		// super.setPrecio(super.getPrecio() * this.recargo);
		// }

	}

	// METODOS

	public String getTipodeporte() {
		return tipodeporte;
	}

//	public boolean isInternacional() {
//		return internacional;
//	}
//
//	public void setInternacional(boolean internacional) {
//		this.internacional = internacional;
//	}

	@Override
	public double bonificaCorporativo(int cantInvitados) {
		// TODO Auto-generated method stub
		return 0;
	}

	// TODO:QUE HACEMOS CON EL PRECIO
	// @Override
	// public String toString() {
	// return "Deportes [" + "Tipo de deporte: " + tipodeporte + ", Flag
	// internacional: " + internacional
	// + " ID Entrada: " + super.getidEntrada() + " " + "Duracion: " +
	// super.getDuracion() + " Precio: $"
	// + super.getPrecio() + "]";
	// }
	
	// TODO: QUE HACEMOS CON LOS PRECIOS
	// public double bonificaCorporativo(int cantInvitados) {
	// if (cantInvitados > 20) {
	// return super.getPrecio() * 0.85;
	// }
	// return super.getPrecio();
	// }
}
