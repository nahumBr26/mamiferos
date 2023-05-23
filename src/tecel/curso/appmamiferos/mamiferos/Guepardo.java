package tecel.curso.appmamiferos.mamiferos;

public class Guepardo extends Felino {
	
	public Guepardo(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
		super(habitat, altura, largo, peso, tamanoGarras, velocidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "El guepardo caza junto a su grupo en las llanuras africanas con una mordida inferior a los demás felinos";
	}

	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return "El guepardo duerme mucho ";
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return "El guepardo es el felino más veloz a " + velocidad +" km/h";
	}

	@Override
	public String comunicarse() {
		// TODO Auto-generated method stub
		return "El guepardo se comunica mediante rugidos bajos";
	}

}
