package orientacao_a_objetos.encapsulamento.casaB;

import orientacao_a_objetos.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	Ana mae = new Ana();
	
	public void testeDeAcesso() {
		System.out.println("Pedro não sabe o segredo de Ana! (private)");
		System.out.println("Pedro é filho de ana, mas não mora na mesma casa. (default)"
				+ "então não sabe o que ela faz lá. (Default)");
		System.out.println("Pedro herdou a a cor do cabelo de sua mãe, então ele tem "+corDoCabelo+". (protected)");
		System.out.println("Todos sabem: "+mae.todosSabem+". (public)");
	}
	
	public static void main(String[] args) {
		Pedro filho = new Pedro();
		
		filho.testeDeAcesso();
	}
}
