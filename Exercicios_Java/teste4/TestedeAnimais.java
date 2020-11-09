package teste4;

public class TestedeAnimais {
	public static void main(String args[])
	{
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Thor");
		cachorro.setIdade(5);
		cachorro.setSom("latir");
		cachorro.setMovimento("correr");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Nicolosi");
		cavalo.setIdade(12);
		cavalo.setSom("relinchar");
		cavalo.setMovimento("Deve correr");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Marcola");
		preguica.setIdade(20);
		preguica.setSom("não sei");
		preguica.setMovimento("subir nas arvores");
		
		Animal[] animais = new Animal[3];
        animais[0] = cavalo;
        animais[1] = cachorro;
        animais[2] = preguica;
        
        for(Animal animal: animais) {
                System.out.println(animal.getNome());
            }
		
	}
}
