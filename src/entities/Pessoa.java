package entities;

public class Pessoa {
	public String nome;
	public int idade;
		
	public void fazAniversario(char niver) {
		///System.out.println(destino);
		if (niver == 's') {
			// Faz aniversário!
			idade++; 
			//return false;
		}
		else {
			
		//	idade =++;
			//return true;
		}
	}
			
	public String recuperaDadosParaImpressao() {
		String dados = "Nome: " + this.nome;
		dados += "\nIdade: " + this.idade;
		return dados;
		}
}
