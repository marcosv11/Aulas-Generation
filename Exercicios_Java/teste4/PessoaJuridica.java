package teste4;

public class PessoaJuridica extends Pessoa1x{
	private long cnpj;

	public PessoaJuridica()
	{
		
	}
	
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome()
	{
		return "Pessoa juridica: "+super.getNome()+ " - CNPJ: "+this.getCnpj();
	}
	
}
