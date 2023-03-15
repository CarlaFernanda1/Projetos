package atv7;

public class Secundario {
	public static double salario (double hora) {
		double salario;
		
		salario = 12.25*hora;
		System.out.println(salario);
		
		return salario;
	}
	
	public static void verificacao (double salario) {
		if (salario < 50) {
			System.out.println("Atenção, dirija-se à direção do Hotel!");
		} 
	}
}
