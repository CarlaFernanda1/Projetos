package atv4;

public class Secundario {
	public static int soma_impar () {
	int soma = 0;	
	
	for (int i = 0; i <= 30; i++) {
		if (i%2 != 0) {
			soma = soma + i;
		} 
	}
	
	return soma;
	}
	
	public static int mult_par () {
		int mult = 1;	
		
		for (int i = 0; i <= 30; i++) {
			if (i%2 == 0) {
				mult = mult * i;
			} 
		}
		return mult;
}
}