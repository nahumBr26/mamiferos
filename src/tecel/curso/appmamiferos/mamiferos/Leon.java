package tecel.curso.appmamiferos.mamiferos;

public class Leon extends Felino{
		

	private int numManada;
	
	private double potenciaRugidoDecibel;


	
	
	public Leon(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad, int numManada,
			double potenciaRugidoDecibel) {
		super(habitat, altura, largo, peso, tamanoGarras, velocidad);
		this.numManada = numManada;
		this.potenciaRugidoDecibel = potenciaRugidoDecibel;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "El lenon caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
	}

	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return "El leon duerme en las estepas africanas";
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return "El leon corre a " + velocidad + " km/h";
	}

	@Override
	public String comunicarse() {
		// TODO Auto-generated method stub
		return "El leon ruge fuerte a " + potenciaRugidoDecibel + " Decibelios ";
	}

	public int getNumManada() {
		return numManada;
	}

	public double getPotenciaRugidoDecibel() {
		return potenciaRugidoDecibel;
	}	
	
	

}
