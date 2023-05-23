package tecel.curso.appmamiferos.mamiferos;

public class Perro extends Canino{
	
	private int fuerzaMordida; 
	
	

	public Perro(String habitat, float altura, float largo, float peso, String color, float tamanoColmillos,
			int fuerzaMordida) {
		super(habitat, altura, largo, peso, color, tamanoColmillos);
		this.fuerzaMordida = fuerzaMordida;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "El perro africano caza en manada con una fuerte mordida de" + fuerzaMordida + "psi, posee fuertes mandibulas y grandes orejas redondas";
	}

	@Override
	public String dormir() {
		// TODO Auto-generated method stub
		return "El Perro Africano duerme lo suficiente en la sabana";
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return "El Perro Africano corre bajo el sol";
	}

	@Override
	public String comunicarse() {
		// TODO Auto-generated method stub
		return "El Perro Africano ladran cuando se muestra la luna llena ";
	}

	public int getFuerzaMordida() {
		return fuerzaMordida;
	}

	
	
}
