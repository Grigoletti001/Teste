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
		dados += "\nN�mero: " + this.numero;
		dados += "\nN�mero: " + this.saldo;
		dados += "\nN�mero: " + this.agencia;
		dados += "\nN�mero: " + this.dataDeAbertura;
		return dados;
		}
}
