package aplication;

import entities.Conta;

class Main {
	public static void main(String[] args) {
// criando a conta
		Conta minhaConta1;
		minhaConta1 = new Conta();
		minhaConta1.saldo = 4000;
		System.out.println("Saldo = " + minhaConta1.saldo);

		Conta minhaConta2 = new Conta();
		minhaConta2.saldo = 3000;
		System.out.println("Saldo = " + minhaConta2.saldo);

		//boolean consegui = minhaConta2.saca(2000);
		//if (consegui) {
			// if (minhaConta.saca(2000)) {
			//System.out.println("Consegui sacar");
			//System.out.println("Saldo =" + minhaConta2.saldo);
		//} else {
			//System.out.println("Não consegui sacar");
		//}
		
		boolean transf = minhaConta1.transferePara(minhaConta2, 2000);
		if (transf) {
			System.out.println("Consegui sacar");
			System.out.println("Saldo = " + minhaConta2.saldo);
		} else {
			System.out.println("Não consegui sacar");
		}
		System.out.println(minhaConta1);
	}
}
