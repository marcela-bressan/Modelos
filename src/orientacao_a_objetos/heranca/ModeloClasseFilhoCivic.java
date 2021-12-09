package orientacao_a_objetos.heranca;

public class ModeloClasseFilhoCivic extends ModeloClassePaiCarro{
	public ModeloClasseFilhoCivic (){
		super(250); 
	}
	
	@Override
	public void acelerar() {
		velocidadeAtual +=10;
	}
	@Override
	public void frear() {
		velocidadeAtual -=10;
	}
}
