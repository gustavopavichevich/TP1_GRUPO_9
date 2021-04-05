package entity;
import dao.IGeneroDAO;
import entity.Evento;

public class Recital extends Evento implements IGeneroDAO{

	private boolean vip;
	public Genero genero;
	private int cantsoporte;
	private static int cont = 0;


	// CONTRUCTORES

	public Recital() {
		super();
	}

	public Recital(boolean vip, String genero, int cantsoporte) {
		super();
		this.setGenero(genero);
		this.vip = vip;
		this.cantsoporte = cantsoporte;
	}

	// METODOS

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

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Recital.cont = cont;
	}

	@Override
	public Genero consultarGenero() {
		return this.genero;
		// TODO Auto-generated method stub
		
	}

}
