package orientacao_a_objetos.relacionamentos.de_um_pra_um;

public class ModeloUmMarido {
	String nome;
	ModeloUmaEsposa esposa;
	
	
	ModeloUmMarido(String nome, String nomeEsposa){
		this.nome = nome;
		this.esposa = new ModeloUmaEsposa(nomeEsposa, this);
	}
}
