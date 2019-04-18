package exemplos;

public class Conta {
	
	public int numero;
	public String titular;
	public double saldo;
	public String agencia;
	public String dataDeAbertura;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void saca(double valor) {
		this.saldo = this.saldo - valor;
		}
			
	public double calculaRendimento(double valor) {
		double rend = 0.1*valor;
		return rend;	
	}
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nNúmero: " + this.saldo;
		dados += "\nNúmero: " + this.agencia;
		dados += "\nNúmero: " + this.dataDeAbertura;
		return dados;
		}
}
