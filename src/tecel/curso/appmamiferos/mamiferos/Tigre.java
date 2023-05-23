package tecel.curso.appmamiferos.mamiferos;

public class Tigre extends Felino{
	
	private String especieTigre;
	
	
	public Tigre(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad,
			String especieTigre) {
		super(habitat, altura, largo, peso, tamanoGarras, velocidad);
		this.especieTigre = especieTigre;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "El tigre " + especieTigre + " caza solitario en los manglares y bosques amazonicos de " + habitat;
	}

	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return "El tigre " + especieTigre + " duerme en las selvas de " + habitat;
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return "El tigre " + especieTigre + " corre a " + velocidad + " km/h";
	}

	@Override
	public String comunicarse() {
		// TODO Auto-generated method stub
		return "El tigre ruge y agacha sus orejas";
	}

	public String getEspecieTigre() {
		return especieTigre;
	}

	
	
	

}
