package main;
import entity.Evento;
import entity.Show;
import util.ComprarEntrada;
public class Principal extends ComprarEntrada {
	
	public static void main(String[] args) {
				ComprarEntrada compraEntrada = new ComprarEntrada();
				Show _show= new Show();
				Evento _evento = new Evento();
				
				_show.setEvento(_evento);
				compraEntrada.setShow(_show);
		}
}

