package exemplos;

public class Conta2 {
	public int numero;
	public double saldo;
	public String agencia;
	public String dataDeAbertura;
	public Cliente titular;

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nN�mero: " + this.numero;
		dados += "\nN�mero: " + this.saldo;
		dados += "\nN�mero: " + this.agencia;
		dados += "\nN�mero: " + this.dataDeAbertura;
		return dados;
	}
}
