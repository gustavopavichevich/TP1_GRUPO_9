package entity;
import dao.IGenerosDAO;
import entity.Eventos;

public class Recitales extends Eventos implements IGenerosDAO {

	private boolean vip;
	public Generos generos;
	public Bandas bandas;
	private int cantsoporte;
	//private static int cont = 0;


	// CONTRUCTORES

	public Recitales() {
		super();
	}
	public Recitales(boolean vip, String genero, String banda, int cantsoporte) {
		super();
		//this.setGenero(genero);//no lo toma
		//this.setBandas(banda);//no lo toma
		this.vip = vip;
		this.cantsoporte = cantsoporte;
		
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

	public void setGenero(String genero) {
		this.generos.setDescripcion(genero);
	}

	
	public int getCantsoporte() {
		return cantsoporte;
	}

	public void setCantsoporte(int cantsoporte) {
		this.cantsoporte = cantsoporte;
	}

	/*public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Recitales.cont = cont;
	}*/

	@Override
	public Generos consultarGenero() {
		return this.generos;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Recitales [vip=" + vip + ", genero=" + generos + ", bandas=" + bandas + ", cantsoporte=" + cantsoporte
				 + "ID ENTRADA: "+ super.getidEntrada()+ "   " +"Duracion: " + super.getDuracion() 
				+ "  Precio: $" + super.getPrecio();
	}

}
