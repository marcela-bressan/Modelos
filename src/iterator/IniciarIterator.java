package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IniciarIterator {
		public static void main(String[] args) {
			System.out.println("Interface Iterator --> hasNext | isNext");
			
			List<String> lista = Arrays.asList("item1","item2","item3","item4");
			
			Iterator<String> itLista = lista.iterator();
			
			while(itLista.hasNext()) {
				System.out.println(itLista.next());
			}
			
		}
}
