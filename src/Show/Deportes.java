package Show;

	import Show.Evento;

	public class Deportes extends Evento {
		
		private String tipodeporte;
		private boolean internacional;
		
		
		
		public String getTipodeporte() {
			return tipodeporte;
		}

		public void setTipodeporte(String tipodeporte) {
			this.tipodeporte = tipodeporte;
		}

		public boolean isInternacional() {
			return internacional;
		}

		public void setInternacional(boolean internacional) {
			this.internacional = internacional;
		}

		public Deportes()
		{
			super();
		}
		
		public Deportes (boolean internacional, String tipodeporte)
		{
			this.internacional=internacional;
		    this.tipodeporte=tipodeporte;
		}

}
