package atv2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		double a, b;
		char oper;
		
		System.out.println("digite um n�mero");
		a = scan.nextDouble();
		System.out.println("digite um n�mero");
		b = scan.nextDouble();
		System.out.println("digite a sua opera��o");
		oper = scan.next().charAt(0);
		
		System.out.println(Secundario.opera(a, b, oper));
		scan.close();
	} 
}
    