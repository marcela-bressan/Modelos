package orientacao_a_objetos.heranca;

public class IniciarTeste {
	public static void main(String[] args) {
		//O Objetivo é mostrar um Exemplo de Herança e Implementação de Interface
		
		System.out.println("Testando um carro comum\n");
		int velocidadeMaximaCarroComum  = 250;
		ModeloClassePaiCarro carro = new ModeloClassePaiCarro(velocidadeMaximaCarroComum);
		
		System.out.println("Tráfego tranquilo até 100km/h");	
		do {
			System.out.println(carro.velocimetro());
			carro.acelerar();
		}while(carro.velocidadeAtual <= 100);
		
		do {
			System.out.println(carro.velocimetro());
			carro.acelerar();
		}while(carro.velocidadeAtual < 180);
		System.out.println("Travamento em menos de 180km/h");
		carro.velocidadeAtual = 0;
		
		for (int i=0; i<2; i++) {
			for (int j=0;j<=3;j++ ) {
				carro.acelerar();
				System.out.println(carro.velocimetro());
			}
			for (int j=0;j<=3;j++ ) {
				carro.frear();
				System.out.println(carro.velocimetro());
			}
			
		}
		
		System.out.println("\nTestando um Civic\n");
		ModeloClasseFilhoCivic civic = new ModeloClasseFilhoCivic();
		
		System.out.println(civic.velocimetro());
		
		for(int i =0;i<3;i++ ) {
			civic.acelerar();
			System.out.println(civic.velocimetro());
			
		}

		for(int i =0;i<3;i++ ) {
			civic.frear();
			System.out.println(civic.velocimetro());
			
		}
		
		
		
		System.out.println("\nTestando uma Ferrari\n");
		ModeloClasseFilhoFerrari ferrari = new ModeloClasseFilhoFerrari();
		
		System.out.println(ferrari.velocimetro());
		for(int i =0;i<3;i++ ) {
			ferrari.acelerar();
			System.out.println(ferrari.velocimetro());
			
		}

		for(int i =0;i<3;i++ ) {
			ferrari.frear();
			System.out.println(ferrari.velocimetro());
			
		}
		
		System.out.println("\nLigando o turbo da ferrari...Acelerando...\n");
		for(int i =0;i<3;i++ ) {
			ferrari.ligarTurbo();
			ferrari.acelerar();
			System.out.println(ferrari.velocimetro());
			
		}
		
		System.out.println("Desligar turbo da ferrari...Freando...");
		
		for(int i =0;i<5;i++ ) {
			ferrari.desligarTurbo();
			ferrari.frear();
			System.out.println(ferrari.velocimetro());
			
		}
		
		System.out.println("Ligando ar condicionado...");
		ferrari.ligarAr();
		
		System.out.println("O ar está ligado: "+ferrari.isAr());
		
		System.out.println("Desligando o ar condidionado...");
		ferrari.desligarAr();
		System.out.println("O ar está ligado: "+ferrari.isAr());
		
	}
}
