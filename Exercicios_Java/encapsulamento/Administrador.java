package encapsulamento;

public class Administrador extends Pessoa_ {
	private String ajudaDeCusto;
	
	public Administrador(String nome,long cpf, String setor, String ajudaDeCusto) {
		super(nome,cpf,setor);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public String getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(String ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

}