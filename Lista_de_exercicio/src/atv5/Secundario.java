package atv5;

public class Secundario {
	public static String parouimpar ( int numero) {
		String situacao;
		
		if (numero%2 == 0) {
			situacao = "par";
		} else {
			situacao = "impar";
		}
		
		return situacao;
	}
	public static String primo ( int numero) {
		String situacao2 = null;
		
		for (int i = 2; i < 10; i++) {
			if (numero%i == 0) {
				situacao2 = "Não é primo";
			} else {
				situacao2 = "é primo";
			}
		}
		
	
		
		return situacao2;
	}
}
