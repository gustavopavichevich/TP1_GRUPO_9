package entity;
import java.util.Date;

import dao.IEntrada;
import dao.IGenerosDAO;
import entity.Eventos;

public class Recitales extends Eventos implements IGenerosDAO,IEntrada {

	private boolean vip;
	public Generos generos;
	public Bandas bandas;
	private int cantsoporte;
	//private static int cont = 0;


	// CONTRUCTORES

	public Recitales() {
		super();
	}
	public Recitales(boolean vip, Generos genero, Bandas banda, int cantsoporte, Date fecha) {
		super();
		this.setGeneros(genero);//no lo toma
		this.setBandas(banda);//no lo toma
		this.vip = vip;
		this.cantsoporte = cantsoporte;
		super.setTipoEvento("Recital");
		super.setTitulo(banda.getNombre());
		super.setFecha(fecha);
		
		if(vip==true) {
			super.setPrecio(1500);
		}
		else
		{
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

	public String getBandas() {
		return bandas.toString();
	}

	public void setBandas(String banda) {
		this.bandas.setNombre(banda);
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
	public void setBandas(Bandas bandas) {
		this.bandas = bandas;
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Recitales [Flag vip: " + vip + ", Genero: " + generos.getDescripcion() + ", Bandas: " + bandas.getNombre() + ", cantsoporte: " + cantsoporte
				 + " ID entrada: "+ super.getidEntrada()+ "   " +"Duracion: " + super.getDuracion() 
				+ "  Precio: $" + super.getPrecio() + "]";
	}
	@Override
	public String ConsultarDatosEntrada() {
		// TODO Auto-generated method stub
		return "Genero: "+ this.getGenero()+ ", Tipo de Evento: " + super.getTipoEvento() + ", Duracion: " + super.getDuracion() + ", ID Entrada: " + super.getidEntrada() + ", ID Evento: " + super.getIdEvento() + ", Precio: "+ super.getPrecio() + ", Titulo: "+ super.getTitulo() + ", Fecha: "+super.getFecha();
	}

	public double bonificaCorporativo(int cantInvitados, String Empresa) {
		return 1.0;
	}
}
