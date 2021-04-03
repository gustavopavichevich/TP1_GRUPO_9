package entity;

	import entity.Evento;

	public class Infantil extends Evento {
		
		private boolean souvenir; 
		private int edad;
		
		
		
		public Infantil()
		{
			super();
		}
		
		public Infantil( boolean souvenir, int edad)
		{
			this.souvenir=souvenir;
			this.edad=edad;
			
		}

		public boolean isSouvenir() {
			return souvenir;
		}

		public void setSouvenir(boolean souvenir) {
			this.souvenir = souvenir;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
	}
