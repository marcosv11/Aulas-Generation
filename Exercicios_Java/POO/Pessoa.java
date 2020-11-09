package POO;

public class Pessoa {
	private  String primeiroNome;
	private  String nomeDoMeio;
	private  String ultimoNome;
	
	public Pessoa (String primeiro, String meio, String ultimo)
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomeDoMeio = meio;
	}
	
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomeDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
}
 