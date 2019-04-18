package entities;

public class Conta {
	public int numero;
	public String titular;
	public double saldo;

	public boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}

	public boolean transferePara(Conta destino, double valor) {
		System.out.println(destino);
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			// não deu pra sacar!
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	public String toString() {
		return numero + titular + saldo;
	}

}


