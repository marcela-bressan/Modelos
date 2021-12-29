package streamAPI.filter;

public class Produto {
	String nome;
	int quantidade;
	double preco;
	double desconto;
	double valorFrete;
	
	
	Produto (String nome, int quantidade){
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
	Produto (String nome, double preco, double desconto, double valorFrete  ){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.valorFrete = valorFrete;
	}
}
