package revi;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner (System.in);
	Secundario a = new Secundario ();
	int c;
	int d;
	System.out.println("Digite o primeiro n�mero: ");
	c = in.nextInt();
	System.out.println("Digite o segundo n�mero: ");
	d = in.nextInt();
	System.out.println("O resultado �: "+a.somar(c, d));

		
		
	}

}
