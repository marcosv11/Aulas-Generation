package encapsulamento;

public class Pessoa_ {
	
	private String nome;
	private long cpf;
	private String setor;
 
	public Pessoa_ (String nome, long cpf, String setor) {
	this.nome = nome;
	this.cpf = cpf;
	this.setor = setor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
