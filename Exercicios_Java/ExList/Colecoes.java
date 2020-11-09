package ExList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {
	public static void main ( String args [])
	{
		Collection<String> nomes = new ArrayList();
		nomes.add("Marcos");
		nomes.add("Ana Livia");
		nomes.add("Carol Castilho");
		nomes.add("Sidney");
		Collection<String> nomes2 = Arrays.asList("Celso","Mandrake");
		nomes.addAll(nomes2);
		System.out.println(nomes);
		/*if(nomes.isEmpty()) *VERIFICA SE A LISTA ESTÁ VAZIA*
		//{
		//System.out.println("Lista vazia");	
		nomes.remove("Mandrake") PARA REMOVER ITENS DA LISTA
		nomes.clar(); PARA LIMPAR A LISTA
		System.out.println("Contem tal nome?"+nomes.contains("Mandrake"));
	}*/
	
	}
}
