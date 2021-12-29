package orientacao_a_objetos.abstracao;

public abstract class ModeloClasseAbstratoPaiAnimal{
	
	
	abstract void alimentar();
	
	void mover() {
		System.out.println(" está se movendo...");
	}
	
	void respirar() {
		System.out.println(" está respirando oxigênio...");
	};
}
