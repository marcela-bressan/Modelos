package threads;

import java.util.Iterator;

public class Teste1 implements Runnable {

	@Override
	public void run() {
		 for (int i = 0; i< 10; i++) {
			 System.out.println("Teste 1");
			 try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				}
		 }
		
	}
		
}
