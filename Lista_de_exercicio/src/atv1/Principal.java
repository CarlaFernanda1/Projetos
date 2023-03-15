package atv1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int a;
		
		System.out.println("digite um número");
		a = scan.nextInt();
		
		
		Secundario.tabuada(a);
		scan.close();
	} 
}
    