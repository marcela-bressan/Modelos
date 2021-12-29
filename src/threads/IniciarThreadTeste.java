package threads;

public class IniciarThreadTeste {
	public static void main(String[] args) {
	
		
		Runnable teste1 = new Teste1();
		Runnable teste2 = new Runnable(){

			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Teste 2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
					}
					
				}
				
			}
		};
		
		Thread t1 = new Thread(teste1);
		Thread t2 = new Thread(teste2);
		
		t1.start();
		t2.start();
			
	}
}