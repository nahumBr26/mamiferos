package tecel.curso.appmamiferos.mamiferos;

public class Lobo extends Canino{
	private int numCamada; 
	
	private String especieLobo;

	
	
	
	public Lobo(String habitat, float altura, float largo, float peso, String color, float tamanoColmillos,
			int numCamada, String especieLobo) {
		super(habitat, altura, largo, peso, color, tamanoColmillos);
		this.numCamada = numCamada;
		this.especieLobo = especieLobo;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "El lobo" + especieLobo + " caza junto a su grupo de " + numCamada + " individuos";
	}

	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return "El lobo " + especieLobo + " corre en las llanuras aledañas a los bosques de " + habitat;
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return "El Lobo "+ especieLobo + "corre en las llanuras aledañas a los bosques de su  " + habitat ;
	}

	@Override
	public String comunicarse() {
		// TODO Auto-generated method stub
		return "El lobo " + especieLobo + " " + color + " aulla en la luna llena" ;
	}

	public int getNumCamada() {
		return numCamada;
	}

	public String getEspecieLobo() {
		return especieLobo;
	}
	
	
	
}
