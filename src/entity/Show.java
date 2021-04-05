package entity;

public class Show {

	private int idShow;
	private Evento evento;

	// CONSTRUCTOR

	public Show() {
	}


	public Show(Evento evento) {
		this.evento.setDuracion(evento.getDuracion());
		this.evento.setFecha(evento.getFecha());
		this.evento.setTipoEntrada(evento.getTipoEntrada());
		this.evento.setTipoEvento(evento.getTipoEvento());
		this.evento.setTitulo(evento.getTitulo());
		this.evento.setValor(evento.getValor());
		this.evento.setIdentrada(evento.getIdentrada());
		this.evento.setIdEvento(evento.getIdEvento());
	}

	// METODOS

	public int getIdShow() {
		return idShow;
	}

	public void setIdShow(int idShow) {
		this.idShow = idShow;
	}
	public Evento getEvento() {
		return evento;
	}
	
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	@Override
	public String toString() {
		return "Show [idShow=" + idShow + "]";
	}
}

