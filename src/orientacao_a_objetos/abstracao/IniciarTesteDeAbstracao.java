package orientacao_a_objetos.abstracao;

public class IniciarTesteDeAbstracao {
	public static void main(String[] args) {
		
		System.out.println("Teste Cachorro...");
		ModeloClasseComumCachorro cachorro = new ModeloClasseComumCachorro();
		cachorro.respirar();
		cachorro.alimentar();
		cachorro.mover();
		cachorro.latir();
		
		System.out.println("\nTeste Passarinho...");
		ModeloClasseComumPassarinho passarinho = new ModeloClasseComumPassarinho();
		passarinho.respirar();
		passarinho.alimentar();
		passarinho.mover();
		passarinho.cantar();
		
		
		System.out.println("\nTeste Gato...");
		ModeloClasseComumGato gato = new ModeloClasseComumGato();
		gato.respirar();
		gato.alimentar();
		gato.mover();
		gato.miar();
		
		
		
	}
}
