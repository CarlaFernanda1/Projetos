package atv2;

public class Secundario {
	public static double opera (double a, double b, char oper) {
		double resultado = 0;
		
		switch (oper) {
		case '-':
			resultado = a - b;
			break;

		case '+':
			resultado = a +b;
			break;
			
		case '*':
			resultado = a * b;
			break;
			
		case '/':
			resultado = a / b;
			break;
		}
		
		return resultado;
}
}