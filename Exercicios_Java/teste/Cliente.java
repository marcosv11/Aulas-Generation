package teste;

public class Cliente {
	
	private String primeiroNome;
	private String segundoNome;
	private String terceiroNome;
	
	public Cliente (String primeiro, String segundo, String terceiro)
	{
		primeiroNome = primeiro;
		segundoNome = segundo;
		terceiroNome = terceiro;
	}
		
	public String getNomeCompleto(){
		String nomeCompleto = primeiroNome+" "+segundoNome+" "+terceiroNome;
		return nomeCompleto;
	}

}
