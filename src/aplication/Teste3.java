package aplication;

import exemplos.Cliente;
import exemplos.Conta2;

public class Teste3 {

	public static void main(String[] args) {
		Conta2 minhaConta = new Conta2();
		Cliente c = new Cliente();
		
		minhaConta.numero = 123;
		minhaConta.agencia = "45678-9";
		minhaConta.saldo = 50.0;
		minhaConta.dataDeAbertura = "04/06/2015";
		
		
		System.out.println(minhaConta.recuperaDadosParaImpressao());
		
		c.nome = "Hugo";
		c.sobrenome = "Carvana";
		c.cpf = "522.591.969-01";
				
		minhaConta.titular = c;
		System.out.println("Titular:" + c.nome);
		minhaConta.titular.nome = "GGGGGGG";
		System.out.println("Titular:" + c.nome);
		
		}

}
