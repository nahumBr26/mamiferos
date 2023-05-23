package tecel.curso.appmamiferos.mamiferos;

public class EjemploMamiferos {

	public static void main(String[] args) {
		Mamifero [] mamiferos = new Mamifero[6];
		Mamifero leon = new Leon("Sur de Africa", 120, 220, 190, 58, 7, 5, 120d);
		Mamifero tigre = new Tigre("Rusia", 130, 330, 300, 72, 8, "Siberanio");
		Mamifero lobo = new Lobo("Europa", 80, 120, 80, "Gris Marron", 50, 4, "Iberico");
		Mamifero perro = new Perro("Africa", 43, 92, 40, "Tricolor de manchas negras con blancas", 25, 317);
		Mamifero tigreBengala = new Tigre("Rusia", 110, 260, 280, 12, 9, "Bengala");
		Mamifero guepardo = new Guepardo("Africa", 96, 140, 98, 15, 9);
		
		mamiferos[0] = leon;
		mamiferos[1] = tigre;
		mamiferos[2] = lobo;
		mamiferos[3] = perro;
		mamiferos[4] = tigreBengala;
		mamiferos[5] = guepardo;
		
		for(Mamifero animal : mamiferos) {
			System.out.println(" =========================== " + animal.getClass().getSimpleName() + " =========================== ");
			System.out.println("Habitat :" + animal.getHabitat());
			System.out.println("Altura :" + animal.getAltura());
			System.out.println("Largo :" + animal.getLargo());
			System.out.println("Peso :" + animal.getPeso());
			
			if(animal instanceof Canino) {
				System.out.println("Colmillos:" + ((Canino) animal).getTamanoColmillos());
				System.out.println("Color:" + ((Canino) animal).getColor());
			}
			
			if(animal instanceof Lobo) {
				System.out.println("Especie Lobo: " + ((Lobo) animal).getEspecieLobo());
				System.out.println("Número de integrantes Lobo: " + ((Lobo) animal).getNumCamada());
			}
			
			if(animal instanceof Perro) {
				System.out.println("Fueza Mordida: " + ((Perro) animal).getFuerzaMordida());				
			}
			
			if(animal instanceof Felino) {
				System.out.println("Tamaño de Garras: " + ((Felino) animal).getTamanoGarras());
				System.out.println("Velocidad: " + ((Felino) animal).getVelocidad());				
			}
			
			if(animal instanceof Leon) {
				System.out.println("Manada: " + ((Leon) animal).getNumManada());
				System.out.println("Potencia de rugido: " + ((Leon) animal).getPotenciaRugidoDecibel());				
			}
			
			if(animal instanceof Tigre) {
				System.out.println("Especie: " + ((Tigre) animal).getEspecieTigre());							
			}
			
			System.out.println(animal.comer());
			System.out.println(animal.dormir());
			System.out.println(animal.correr());
			System.out.println(animal.comunicarse());
			
		}
		
	}

}
