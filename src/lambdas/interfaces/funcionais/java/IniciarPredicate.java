package lambdas.interfaces.funcionais.java;

import java.util.Scanner;
import java.util.function.Predicate;

public class IniciarPredicate {
	public static void main(String[] args) {
		//Recebe um tipo qualquer e retorna em boolea	
		//Predicate<T> -> Boolean
		
		System.out.println("***TESTE DE MAIORIDADE***");
		Predicate <ModeloPessoa> isMaior = pessoa -> pessoa.idade >= 18;
		
		ModeloPessoa pessoa1 = new ModeloPessoa(18);
		ModeloPessoa pessoa2 = new ModeloPessoa(15);
		ModeloPessoa pessoa3 = new ModeloPessoa(27);
		ModeloPessoa pessoa4 = new ModeloPessoa(65);
		
		
		System.out.println("\nPESSOA 1 IDADE >= 18:"+isMaior.test(pessoa1));
		System.out.println("PESSOA 2 IDADE >= 18: "+isMaior.test(pessoa2));
		System.out.println("PESSOA 3 IDADE >= 18: "+isMaior.test(pessoa3));
		System.out.println("PESSOA 4 IDADE >= 18: "+isMaior.test(pessoa4));
		
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDIGITE A SUA IDADE: ");
		int idade = entrada.nextInt();
		
		Predicate <Integer> isMaior2 = pessoa -> idade >= 18;
		
		System.out.println("VOCÊ IDADE >= 18: "+isMaior2.test(idade));
		
		System.out.println("\n***TESTE DE NOME MUITO GRANDE ***");
		
		Predicate<ModeloPessoa> isGrande = pessoa -> pessoa.nome.length() >= 8;

		
		pessoa1.nome = "Heleonora";
		pessoa2.nome = "Juliana";
		pessoa3.nome = "Léia";
		pessoa4.nome = "Mariangela";
		
		System.out.println("PESSOA 1 NOME COM LETRAS >=8:"+isGrande.test(pessoa1));
		System.out.println("PESSOA 2 NOME COM LETRAS >=8:"+isGrande.test(pessoa2));
		System.out.println("PESSOA 3 NOME COM LETRAS >=8:"+isGrande.test(pessoa3));
		System.out.println("PESSOA 4 NOME COM LETRAS >=8:"+isGrande.test(pessoa4));
		
		System.out.println("DIGITE O SEU NOME: ");
		String nome = entrada.next();
		
		Predicate<String> isGrande2 = pessoa -> nome.length() >=8;
		
		System.out.println("VOCÊ NOME COM LETRAS >=8:"+isGrande2.test(nome));
		entrada.close();
	}
}
