package teste4;

public class Preguica extends Animal{
	public String getNome()
	{
		return "O nome do bicho preguiça é "+super.getNome()+" a idade dele é "+super.getIdade()+" anos o som que ele emite é "+super.getSom()+" a ação dele é "+this.getMovimento();	}
}
