package entity;

import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;


public class ventaEntradas {

	private int idFactura;
	private static int contFactura=0;
	private LocalDate diaVenta;
	private Clientes cliente;
	private ArrayList<Entradas> listaEntradas;
	private double montoTotal;
	
	//sets y gets
	public LocalDate getDiaVenta() {
		return diaVenta;
	}
	public void setDiaVenta(LocalDate diaVenta) {
		this.diaVenta = diaVenta;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public ArrayList<Entradas> getListaEntradas() {
		return listaEntradas;
	}
	public void setListaEntradas(ArrayList<Entradas> listaEntradas) {
		this.listaEntradas = listaEntradas;
	}
	public double getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}
	public ventaEntradas(LocalDate fecha, Clientes cliente, ArrayList<Entradas> listaEntradas,
			double montoTotal) {
		this.idFactura = contFactura;
		this.diaVenta = fecha;
		this.cliente = cliente;
		this.listaEntradas = listaEntradas;
		this.montoTotal = montoTotal;
		contFactura ++;
	}
	
	public ventaEntradas() {
		this.idFactura = contFactura;
		contFactura ++;
	}
	
	@Override
	public String toString() {
		return "ventaEntradas [idFactura=" + idFactura + ", diaVenta=" + diaVenta + ", cliente=" + cliente
				+ ", listaEntradas=" + listaEntradas + ", montoTotal=" + montoTotal + "]";
	}
	
	
}
