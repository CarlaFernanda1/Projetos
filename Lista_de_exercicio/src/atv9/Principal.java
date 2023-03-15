package atv9;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		
		System.out.println("digite um número");	
		num = scan.nextInt();
				
		System.out.println(Secundario.calendario(num));
		scan.close();
	}		
}
