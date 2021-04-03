package Show;

public class Entrada {
	
	//atributos
	
	private int identrada;

    
	
	private static int cont=0;
	
	//método
	
	public static int devuelveProximoId()
	{
		return cont+1;
	}
	
	
	//contructores
	
	public Entrada()
	{
		cont++;
		this.identrada = cont;
		
	}
	
	public Entrada (int identrada, int precio, int tiempo)
	{
		this.identrada = cont++;
	}
	
	
	public int getIdentrada() {
		return identrada;
	}


	public void setIdentrada(int identrada) {
		this.identrada = identrada;
	}


}


	
	
	