package atv6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double hora;
		
		System.out.println("digite quantas horas trabalhadas");
		hora = scan.nextFloat();
		
	
		System.out.println(Secundario.salario(hora));
		scan.close();
	} 
}
