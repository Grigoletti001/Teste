package aplication;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Faz aniversário (S/N)?");
		//sc.nextLine();
		char niver = sc.next().charAt(0);
		
		Pessoa c1 = new Pessoa();
		c1.nome = "Hugo";
		c1.idade = 29;
		c1.fazAniversario(niver);
		
		System.out.println(c1.recuperaDadosParaImpressao());
					
		sc.close();
		
	}
}