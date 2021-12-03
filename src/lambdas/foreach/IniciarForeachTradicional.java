package lambdas.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IniciarForeachTradicional {
	public static void main(String[] args) {
		List<String> lista = Arrays.asList("item1","item2","item3", "item4","item5");
		
		for (String item: lista){
			System.out.println(item);
		}
		
	}
}
