package teste4;

public class Cachorro extends Animal  {
	
	public String getNome()
	{
		return "O nome do cachorro щ "+super.getNome()+" a idade dele щ "+super.getIdade()+" anos o som que ele emite щ "+super.getSom()+" a aчуo dele щ "+this.getMovimento();
	}
}
