package atv8;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float venda, custo;
		
		System.out.println("digite o valor de venda");
		venda = scan.nextFloat();
		
		System.out.println("digite o valor de custo");
		custo = scan.nextFloat();
		
	
		System.out.println(Secundario.vendaecusto(venda, custo));
		scan.close();
	} 
}
