package orientacao_a_objetos.encapsulamento.casaA;

public class Ana {

	private String segredo ="Ana come de madrugada";
	String fazDentroDeCasa = "a Ana acorda muito tarde";
	protected String corDoCabelo = "cabelos escuros";
	public String todosSabem ="Ana fala muito lento ";
	
	
	public void testeDeAcesso() {
		segredo = "Eu como de madrugada";
		fazDentroDeCasa = "Eu acordo muito tarde";
		corDoCabelo = "Eu tenho "+corDoCabelo;
		todosSabem = "Eu falo muito lento";
		
		System.out.println("Meu segredo: "+segredo+"(private)");
		System.out.println("Faço dentro de casa: "+fazDentroDeCasa+"(default)");
		System.out.println("Tenho: "+corDoCabelo+"(protected)");
		System.out.println("Todos sabem:  "+todosSabem+"(public)");
		
		
	}
	public static void main(String[] args) {
		Ana eu = new Ana();
		
		eu.testeDeAcesso();
	}
}
