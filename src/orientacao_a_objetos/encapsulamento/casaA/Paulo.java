package orientacao_a_objetos.encapsulamento.casaA;

public class Paulo {
		Ana esposa = new Ana();
		
		public void testeDeAcessos() {
			System.out.println("Paulo e Ana são casados e moram na casa A (default)");
			System.out.println("Paulo não tem acesso ao segredo de Ana!(private)");
			System.out.println("Paulo mora na mesma casa e sabe que "+esposa.fazDentroDeCasa+". (default)");
			System.out.println("Paulo sabe que Ana tem "+esposa.corDoCabelo+", mas ele não tem. (protected)");
			System.out.println("Todos sabem: "+esposa.todosSabem+"(public)");
		}
		public static void main(String[] args) {
			Paulo esposo = new Paulo();
			
			esposo.testeDeAcessos();
		}
}
