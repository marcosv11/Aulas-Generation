package teste4;

public class Cavalo extends Animal{
	
	public String getNome()
	{
		return "O nome do cavalo � "+super.getNome()+" a idade dele � "+super.getIdade()+" anos o som que ele emite � "+super.getSom()+" a a��o dele � "+this.getMovimento();	}

}
