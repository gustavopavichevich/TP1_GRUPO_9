package entity;

public abstract class Entrada { // #pavi: podemos implementar esta clase como abstract
								// si bien no la instanciamos directamente lo que hacemos
								// es vender entradas de algun evento

	// atributos

	private int identrada;
	private static int cont = 0;
	private String tipoEntrada;
	private int valor;

	// CONSTRUCTORES

	public Entrada() {
		this.identrada = cont++;
	}

	public Entrada(String tipoEntrada, int valor) {
		this.identrada = cont++;
		this.tipoEntrada = tipoEntrada;
		this.valor = valor;
	}

	// METODOS

	public static int devuelveProximoId() {
		return cont + 1;
	}

	// #pavi
	// Esta parte del código la regeneré para mostrar el encapsulamiento
	// public static int getCont() {
	// return cont;
	// }
	//
	//
	// public static void setCont(int cont) {
	// Entrada.cont = cont;
	// }
	//

	public int getIdentrada() {
		return identrada;
	}

	public void setIdentrada(int identrada) {
		this.identrada = identrada;
	}

	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Entrada [identrada=" + identrada + ", tipoEntrada=" + tipoEntrada + ", valor=" + valor + "]";
	}

	
	
}
