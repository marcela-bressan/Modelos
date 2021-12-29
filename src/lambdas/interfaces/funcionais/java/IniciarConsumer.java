package lambdas.interfaces.funcionais.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IniciarConsumer {
	public static void main(String[] args) {
		//Recebe um tipo e não retorna nada
		//Consumer <T> - >
		
		Consumer <ModeloPessoa> imprimir = valor -> System.out.println(valor.nome);
		
		ModeloPessoa pessoa1 = new ModeloPessoa("Maria");
		ModeloPessoa pessoa2 = new ModeloPessoa("João");
		ModeloPessoa pessoa3 = new ModeloPessoa("José");
		ModeloPessoa pessoa4 = new ModeloPessoa("Pedro");
		ModeloPessoa pessoa5 = new ModeloPessoa("Ana");
		
		
		List <ModeloPessoa> pessoas  = Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
		
		imprimir.accept(pessoa1);
		
		pessoas.forEach(imprimir);
		
		
		//outras formas de fazer
		pessoas.forEach(p -> System.out.println(p.nome));
		pessoas.forEach(System.out::println);
	}
}
