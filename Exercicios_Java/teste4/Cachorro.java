package teste4;

public class Cachorro extends Animal  {
	
	public String getNome()
	{
		return "O nome do cachorro � "+super.getNome()+" a idade dele � "+super.getIdade()+" anos o som que ele emite � "+super.getSom()+" a a��o dele � "+this.getMovimento();
	}
}
