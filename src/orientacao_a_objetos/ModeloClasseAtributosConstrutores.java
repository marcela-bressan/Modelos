package orientacao_a_objetos;

public class ModeloClasseAtributosConstrutores {
		
		//use this para acessar os atributos da instância
		String modeloPalavra;
		int modeloNumero;
		
		
		//Default
		ModeloClasseAtributosConstrutores(){
			
		}
		
		//Overload
		ModeloClasseAtributosConstrutores(String modeloPalavra){
			this.modeloPalavra = modeloPalavra;
		}
		
		ModeloClasseAtributosConstrutores(int modeloNumero){
			this.modeloNumero = modeloNumero;
			
		}
		
		ModeloClasseAtributosConstrutores(String modeloPalavra, int modeloNumero){
			this.modeloPalavra = modeloPalavra;
			this.modeloNumero = modeloNumero;
		}
		
		ModeloClasseAtributosConstrutores(int modeloNumero, String modeloPalavra){
			this.modeloNumero = modeloNumero;
			this.modeloPalavra = modeloPalavra;
		}
		
		
		
		
		
		
}
