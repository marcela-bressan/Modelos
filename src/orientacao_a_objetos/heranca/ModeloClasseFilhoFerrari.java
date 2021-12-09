package orientacao_a_objetos.heranca;

public class ModeloClasseFilhoFerrari extends ModeloClassePaiCarro implements ModeloInterfaceLuxo, ModeloInterfaceEsportivo {
	private boolean ar = false;
	
	
	public ModeloClasseFilhoFerrari(){
		super(300);
	}
	
	public boolean isAr() {
		return ar;
	}

	public void setAr(boolean ar) {
		this.ar = ar;
	}

	
	@Override
	public void acelerar() {
		velocidadeAtual += 15;
	}
	
	@Override
	public void frear() {
		velocidadeAtual -=15; 
	}
	

	@Override
	public void ligarTurbo() {
		this.velocidadeAtual += 35; 
	}

	@Override
	public void desligarTurbo() {
		this.velocidadeAtual -= 15; 
	}

	@Override
	public void ligarAr() {
		ar = true;
		
	}

	@Override
	public void desligarAr() {
		ar = false;
		
	}

}
