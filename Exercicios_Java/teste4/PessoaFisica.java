package teste4;

public class PessoaFisica extends Pessoa1x{
	private long cpf;

	
	public PessoaFisica()
	{
		
	}
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome()
	{
		return "Pessoa física: "+super.getNome()+ " - CPF: "+this.getCpf();
	}
}
