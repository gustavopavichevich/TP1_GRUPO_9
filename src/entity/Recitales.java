package entity;

import dao.IEntrada;
import dao.IGenerosDAO;
import entity.Eventos;

public class Recitales extends Eventos implements IGenerosDAO, IEntrada {

	private boolean vip;
	public GeneroRecital generos;
	public Bandas banda;
	public Bandas bandaSoporte1;
	public Bandas bandaSoporte2;
	private int cantsoporte;
	private final int valor;
	// private Date fecha;

	// CONTRUCTORES

	public Recitales() {
		super();
	}

	// TODO: ARREGLAR LOS SETEOS PARA QUE ESTO ANDE
	public Recitales(boolean vip, GeneroRecital gen, Bandas banda, Bandas bandaSoporte1, Bandas bandaSoporte2,
			int cantsoporte) {
		super();
		this.setGeneros(gen);
		this.setBanda(banda);
		this.setBandaSoporte1(bandaSoporte1);
		this.setBandaSoporte2(bandaSoporte2);
		this.vip = vip;
		this.cantsoporte = cantsoporte;
		super.setTitulo(banda.getNombre());
		// TOOD: QUE HACEMOS CON EL PRECIO
		// if (vip == true) {
		// super.setPrecio(1500);
		// } else {
		// super.setPrecio(800);
		// }
	}

	// METODOS

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public String getBanda() {
		return banda.toString();
	}

	public void setBanda(Bandas banda) {
		this.banda = banda;
	}

	// TODO: ESTÁ MAL HECHO EL SETEO PORQUE SI QUEREMOS HACER ESTO DEBEMOS
	// IMPLEMENTAR CLONEABLE. EXTENDER ESTA SOLUCIÓN EN TODAS LAS ENTIDADES
	public void setBandaSoporte1(Bandas bandaSoporte1) {
		this.bandaSoporte1 = bandaSoporte1;
	}

	public void setBandaSoporte2(Bandas bandaSoporte2) {
		this.bandaSoporte2 = bandaSoporte2;
	}

	public String getBandaSoporte1() {
		return bandaSoporte1.toString();
	}

	public String getBandaSoporte2() {
		return bandaSoporte2.toString();
	}

	public String getGenero() {
		return generos.getDescripcion();
	}

	public GeneroRecital getGeneros() {
		return generos;
	}

	public void setGeneros(GeneroRecital generos) {
		this.generos = generos;
	}

	public int getCantsoporte() {
		return cantsoporte;
	}

	public void setCantsoporte(int cantsoporte) {
		this.cantsoporte = cantsoporte;
	}

	@Override
	public String consultarGenero() {
		return this.generos.getDescripcion();
	}

	@Override
	public String toString() {
		return "Recitales [vip=" + vip + ", generos=" + this.generos.getDescripcion() + ", banda=" + banda
				+ ", bandaSoporte1=" + bandaSoporte1 + ", bandaSoporte2=" + bandaSoporte2 + ", cantsoporte="
				+ cantsoporte + "]";
	}
	// TODO: QUE HACEMOS CON EL PRECIO
	// @Override
	// public String ConsultarDatosEntrada() {
	// return "Genero: " + this.getGenero() + ", Tipo de Evento: " +
	// super.getTipoEvento() + ", Duracion: "
	// + super.getDuracion() + ", ID Entrada: " + super.getidEntrada() + ", ID
	// Evento: " + super.getIdEvento()
	// + ", Precio: " + super.getPrecio() + ", Titulo: " + super.getTitulo() + ",
	// Fecha: " + super.getFecha();
	// }
	//
	// public double bonificaCorporativo(int cantInvitados) {
	// if (cantInvitados > 20) {
	// return super.getPrecio() * 0.85;
	// }
	// return super.getPrecio();
	// }

	@Override
	public String ConsultarDatosEntrada() {
		// TODO Auto-generated method stub
		return null;
	}

	// TODO: ESTA IMPLEMENTACIÓN NO DEBERIA ESTAR ACA
	@Override
	public double bonificaCorporativo(int cantInvitados) {
		// TODO Auto-generated method stub
		return 0;
	}
}
