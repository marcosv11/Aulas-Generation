package teste;

public class Aviao {
	
	private String modelo;
	private String nomeDoPiloto;
	private int litrosInicial;
	private int distanciaDaViagem;	
	
	public Aviao (String modelo, String nomeDoPiloto, int litrosInicial, int distanciaDaViagem)
	{
		 this.modelo = modelo;
		 this.nomeDoPiloto = nomeDoPiloto;
		 this.litrosInicial = litrosInicial;
		 this.distanciaDaViagem = distanciaDaViagem;
	}
	

	
	
	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public String getNomeDoPiloto() {
		return nomeDoPiloto;
	}




	public void setNomeDoPiloto(String nomeDoPiloto) {
		this.nomeDoPiloto = nomeDoPiloto;
	}




	public int getLitrosInicial() {
		return litrosInicial;
	}




	public void setLitrosInicial(int litrosInicial) {
		this.litrosInicial = litrosInicial;
	}




	public int getDistanciaDaViagem() {
		return distanciaDaViagem;
	}




	public void setDistanciaDaViagem(int distanciaDaViagem) {
		this.distanciaDaViagem = distanciaDaViagem;
	}




	public String getInformaçoes() {
		String info = "O piloto(a) "+nomeDoPiloto+" com o avião modelo: "+modelo+"e a distancia da viagem é "+distanciaDaViagem+" km e o combustivel atual é "+litrosInicial+" lts.";
		return info;
	}
			
}

