package pilares;

public class Autodromo {
	
	public static void main(String[] agrs) {
		Carro jeep = new Carro();
		//jeep.ligar();
		
		Moto z400 = new Moto();
		//z400.ligar();
		
		Veiculo coringa = z400;
		coringa.ligar();
	}
	
}
