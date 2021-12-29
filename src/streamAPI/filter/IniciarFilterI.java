package streamAPI.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class IniciarFilterI {
	public static void main(String[] args) {
		Produto p1 = new Produto("Bola", 17);
		Produto p2 = new Produto("Boneca", 15);
		Produto p3 = new Produto("Bicicleta", 12);
		Produto p4 = new Produto("Skate", 24);
		Produto p5 = new Produto("Carrinho", 23);
		Produto p6 = new Produto("Video-game", 29);
		
		
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		Function<Produto, String> frase = p -> p.nome;
		System.out.println("Produtos que tem mais que 20 em estoque: ");
		produtos.stream()
			.filter(p -> p.quantidade >=20)
			.map(frase)
			.forEach(System.out::println);
	}
}
