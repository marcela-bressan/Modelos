package orientacao_a_objetos.relacionamentos.de_um_pra_um;

public class IniciarCasamento {
	public static void main(String[] args) {
		ModeloUmMarido marido1 = new ModeloUmMarido("Paulo", "Roberta");
		ModeloUmMarido marido2 = new ModeloUmMarido("Felipe", "Eduarda");
		ModeloUmMarido marido3 = new ModeloUmMarido("Pedro", "Marta");
		ModeloUmMarido marido4 = new ModeloUmMarido("Jefferson", "Vanessa");
		
		System.out.println("CASAMENTO: "+marido1.nome+" e "+marido1.esposa.nome); 
		System.out.println("CASAMENTO: "+marido2.nome+" e "+marido2.esposa.nome);
		System.out.println("CASAMENTO: "+marido3.nome+" e "+marido3.esposa.nome);
		System.out.println("CASAMENTO: "+marido4.nome+" e "+marido4.esposa.nome);
		
	}
}
