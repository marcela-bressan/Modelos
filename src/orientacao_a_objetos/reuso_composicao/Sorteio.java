package orientacao_a_objetos.reuso_composicao;

import java.util.ArrayList;
import java.util.List;

public class Sorteio {
	String nomeDoEvento = "***Sorteio de um Iphone***";
	List <Pessoa> candidatos = new ArrayList<>();
	
	@Override
	public String toString() {
		return "Candidato:" + candidatos;
	}
	
	
}
