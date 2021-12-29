package orientacao_a_objetos.encapsulamento;

import orientacao_a_objetos.encapsulamento.casaA.Ana;
import orientacao_a_objetos.encapsulamento.casaA.Paulo;
import orientacao_a_objetos.encapsulamento.casaB.Julia;
import orientacao_a_objetos.encapsulamento.casaB.Pedro;

public class IniciarTesteEncapsulamento {
	public static void main(String[] args) {
		System.out.println("default: acesso somente ao mesmo pacote.");
		System.out.println("private: acesso somente a mesma classe.");
		System.out.println("protected: acesso somente por herança.");
		System.out.println("public: todos acessam, realizar os devidos imports.");
		
		
		System.out.println("Testando...");
		
		
		Ana ela = new Ana();
		Paulo esposo = new Paulo();
		Pedro filho = new Pedro();
		Julia nora = new Julia();
		
		System.out.println("\nTestando Ana a partir dela mesma... ");
		ela.testeDeAcesso();
		System.out.println("\nTestando Ana a partir de Paulo (marido)... ");
		esposo.testeDeAcessos();
		System.out.println("\nTestando Ana a partir de Pedro (filho)... ");
		filho.testeDeAcesso();
		System.out.println("\nTestando Ana a partir de Julia (nora)... ");
		nora.testeDeAcesso();
		
	}
}
