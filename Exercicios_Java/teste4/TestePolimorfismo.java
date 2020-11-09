package teste4;

public class TestePolimorfismo {
	public static void main(String args[])
	{
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Maria João");
		fisica.setCpf(48974596806L);
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Margiela");
		juridica.setCnpj(11100221L);
		
		Pessoa1x[] pessoas = new Pessoa1x[2];
		pessoas[0]=fisica;
		pessoas[1]=juridica;
		
		for(Pessoa1x pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
		
		
		
	}
}
