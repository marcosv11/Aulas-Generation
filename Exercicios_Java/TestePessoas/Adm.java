package TestePessoas;

import teste4.Pessoa_1;

public class Adm extends Pessoa_1{
	private String ajudaDeCusto;
	
	public Adm(String nome, int cpf, int telefone, int idade, String ajudaDeCusto)
	{
		super(nome,cpf,telefone,idade);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public String getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(String ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
}
