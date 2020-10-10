package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto (String origen, String[] letra, String interpretacion) {
		super(origen);
		this.letras=letra;
		this.interpretacion=interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public int cantidadLetras() {
		return this.getLetras().length;
	}
	public String interpretacion() {
		return this.getInterpretacion();
	}
	public String toString() {
		String palabra="";
		for (int i=0;i<this.getLetras().length;i++) {
			if (i==this.getLetras().length-1) {
				palabra+=this.letras[i];
			}else {
				palabra+=this.letras[i]+", ";
			}
		}return palabra;
	}

}
