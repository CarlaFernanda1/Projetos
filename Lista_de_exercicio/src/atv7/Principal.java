package atv7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double hora, salario;
		
		System.out.println("digite quantas horas trabalhadas");
		hora = scan.nextFloat();
		
	
		System.out.println(Secundario.salario(hora));
		
		salario = Secundario.salario(hora);
		
		Secundario.verificacao(salario);
		
		scan.close();
	} 
}
