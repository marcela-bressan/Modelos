package orientacao_a_objetos.relacionamentos.de_um_pra_um;

public class ModeloUmaEsposa {
	String nome;
	ModeloUmMarido marido;

	ModeloUmaEsposa (String nome, ModeloUmMarido marido){
		this.nome = nome;
		this.marido = marido;
	}
}
