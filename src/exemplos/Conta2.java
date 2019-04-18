package exemplos;

public class Conta2 {
	public int numero;
	public double saldo;
	public String agencia;
	public String dataDeAbertura;
	public Cliente titular;

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nNúmero: " + this.saldo;
		dados += "\nNúmero: " + this.agencia;
		dados += "\nNúmero: " + this.dataDeAbertura;
		return dados;
	}
}
