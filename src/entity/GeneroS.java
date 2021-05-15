package entity;

public class GeneroS {
	
	private String sexo;

	public GeneroS() {
	}

	public GeneroS(String sexo) {

	

		switch (sexo) {
		case "masculino":
			this.sexo = sexo;
			break;
		case "femenino":
			this.sexo = sexo;
			break;
		case "bisexual":
			this.sexo = sexo;
			break;
		case "homosexual":
			this.sexo = sexo;
			break;
		
		default:
			this.sexo = "Error de sexo";
			break;
		}
	

	}

	public String getSexo() {
	return sexo;
	}

	public void setSexo(String sexo) {
	this.sexo = sexo;
	}


}
