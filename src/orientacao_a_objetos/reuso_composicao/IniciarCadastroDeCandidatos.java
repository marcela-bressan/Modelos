package orientacao_a_objetos.reuso_composicao;

import java.util.Scanner;

public class IniciarCadastroDeCandidatos {
	public static void main(String[] args) {
		
		Sorteio sorteioIphone = new Sorteio();
		
		System.out.println(sorteioIphone.nomeDoEvento);
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int numero = 0;
		String parar = "n";
		
		do { 
			if (parar.equalsIgnoreCase("n")) {
			System.out.println("Nome:");
			nome = entrada.next();
			
			sorteioIphone.candidatos.add(new Pessoa(nome, numero));
			
			}else {
				break;
			}
			
			System.out.println("Interromper? [s] ou [n]:");
			parar = entrada.next();
			
		}while(parar != "n");
		
		
		for (Pessoa candidato: sorteioIphone.candidatos) {		
			numero+=1;
			System.out.println("| Nº-"+numero+"| Nome - "+candidato.nome+"|");
		}
				
	
		entrada.close();
		
	}
}
