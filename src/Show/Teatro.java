
	
	package Show;

	import Show.Evento;
	import Show.Recital;

	public class Teatro extends Evento {
		
		private Recital genero; 
		private int cantactores;
		
		
		
		public Teatro()
		{
			super();
		}
		
		public Teatro(String generoteatro, int cantactores)
		{
			this.setCantactores(cantactores);
			
		}

		public Recital getGenero() {
			return genero;
		}

		public void setGenero(Recital genero) {
			this.genero = genero;
		}

		public int getCantactores() {
			return cantactores;
		}

		public void setCantactores(int cantactores) {
			this.cantactores = cantactores;
		}

}
