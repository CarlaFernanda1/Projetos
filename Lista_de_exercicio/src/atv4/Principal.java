package atv4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(Secundario.mult_par());
		
		System.out.println(Secundario.soma_impar());	
		
		scan.close();
	} 
}
    