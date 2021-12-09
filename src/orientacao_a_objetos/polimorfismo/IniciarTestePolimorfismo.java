package orientacao_a_objetos.polimorfismo;

public class IniciarTestePolimorfismo {
	public static void main(String[] args) {
		System.out.println("BATALHA DE MESTRES COM SABRE DE LUZ");
		
		System.out.println("\n");
		
		ModeloClasseFilhoJedi jogador1; 
		ModeloClasseFilhoSith jogador2;
		
		jogador1 = new ModeloClasseFilhoJedi("YODA");
		jogador2 = new ModeloClasseFilhoSith("DARTH SIDIOUS");
		
		System.out.println(jogador1.verTabela());
		System.out.println(jogador2.verTabela());
		System.out.println("\n");
		
		for (int i=0;i<3;i++) {
			jogador1.atacarOponente(jogador2);
		
		}
		
		System.out.println(jogador1.nome+" ACERTOU COM O SABRE DE LUZ NO "+jogador2.nome+" 3 VEZES. \n");
		
		for (int i=0;i<2;i++) {
			jogador2.atacarOponente(jogador1);
		}
		
		System.out.println(jogador2.nome+" ACERTOU COM O SABRE DE LUZ NO "+jogador1.nome+" 2 VEZES. \n");
		
		System.out.println(jogador1.verTabela());
		System.out.println(jogador2.verTabela());
		System.out.println("\n");
		

		for (int i=0;i<3;i++) {
			jogador1.atacarOponente(jogador2);		
		}
		
		System.out.println(jogador1.nome+" ACERTOU COM O SABRE DE LUZ NO "+jogador2.nome+" 3 VEZES. \n");
		
		System.out.println(jogador1.verTabela());
		System.out.println(jogador2.verTabela());
		System.out.println("\n");		
		
		jogador1.atacarOponente(jogador2);
		
		System.out.println(jogador1.nome+" ACERTOU COM O SABRE DE LUZ NO "+jogador2.nome+" 1 VEZ. \n");
		
		System.out.println(jogador1.verTabela());
		System.out.println(jogador2.verTabela());
		System.out.println("\n");
		
		jogador2.atacarOponente(jogador1);
		
		System.out.println(jogador2.nome+" ACERTOU COM O SABRE DE LUZ NO "+jogador1.nome+" 1 VEZ. \n");
		
		
		System.out.println(jogador1.verTabela());
		System.out.println(jogador2.verTabela());
		System.out.println("\n");
		
		jogador2.usarOPoderDaForca(jogador1);
		
		System.out.println(jogador2.nome+" USOU O PODER DA FORÇA OBSCURA E ARREMESSOU "+jogador1.nome+" CONTRA O CHÃO DESFALECIDO \n");
		
		System.out.println(jogador1.verTabela());
		System.out.println(jogador2.verTabela());
		System.out.println("\n");
		
		jogador1.revigorar();
		
		System.out.println(jogador1.nome+" CHAMOU O PODER DA REVIGORAÇÃO...\n ");
		
		System.out.println(jogador1.verTabela());
		System.out.println(jogador2.verTabela());
		System.out.println("\n");
		
		jogador1.usarOPoderDaForca(jogador2);
		
		System.out.println(jogador1.nome+" USOU O PODER DA FORÇA CONTRA O "+jogador2.nome+"\n");
		System.out.println(jogador1.verTabela());
		System.out.println(jogador2.verTabela());
		System.out.println("\n");
		
		
	}
}
