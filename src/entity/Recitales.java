package entity;

import java.util.Date;

import dao.IEntrada;
import dao.IGenerosDAO;
import entity.Eventos;

public class Recitales extends Eventos implements IGenerosDAO, IEntrada {

	private boolean vip;
	public Generos generos;
	public Bandas banda;
	public Bandas bandaSoporte1;
	public Bandas bandaSoporte2;
	private int cantsoporte;

	// CONTRUCTORES

	public Recitales() {
		super();
	}

	public Recitales(boolean vip, Generos genero, Bandas banda,Bandas bandaSoporte1,Bandas bandaSoporte2, int cantsoporte, Date fecha) {
		super();
		this.setGeneros(genero);
		this.setBanda(banda);
		this.vip = vip;
		this.cantsoporte = cantsoporte;
		super.setTipoEvento("Recital");
		super.setTitulo(banda.getNombre());
		super.setFecha(fecha);

		if (vip == true) {
			super.setPrecio(1500);
		} else {
			super.setPrecio(800);
		}
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

	public Generos getGeneros() {
		return generos;
	}

	public void setGeneros(Generos generos) {
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
		return "Recitales [vip=" + vip + ", generos=" + generos + ", banda=" + banda + ", bandaSoporte1="
				+ bandaSoporte1 + ", bandaSoporte2=" + bandaSoporte2 + ", cantsoporte=" + cantsoporte + "]";
	}

	@Override
	public String ConsultarDatosEntrada() {
		return "Genero: " + this.getGenero() + ", Tipo de Evento: " + super.getTipoEvento() + ", Duracion: "
				+ super.getDuracion() + ", ID Entrada: " + super.getidEntrada() + ", ID Evento: " + super.getIdEvento()
				+ ", Precio: " + super.getPrecio() + ", Titulo: " + super.getTitulo() + ", Fecha: " + super.getFecha();
	}

	public double bonificaCorporativo(int cantInvitados) {
		if (cantInvitados > 20) {
			return super.getPrecio() * 0.85;
		}
		return super.getPrecio();
	}
}
