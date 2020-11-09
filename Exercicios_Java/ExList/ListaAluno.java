package ExList;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main (String args [])
	{
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a= new Aluno("João da Silva","JAVA",6.8);
		Aluno b= new Aluno("Fernando","php",4.7 );
		Aluno c= new Aluno("Lucas","c+",8.6);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		
		System.out.println(conjunto);
	}
}
  