package implementacao3;

import java.util.Arrays;

public class BrincandoComListaMetodoInterativo {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Brincando com ListaEncadeada...");
		ListaEncadeada_IF lista = new ListaEncadeadaMetodoInterativo();
		System.out.println(lista.isEmpty());
		System.out.println(lista.size() == 0);
		lista.insert(100);
		System.out.println(lista.size() == 1);
		System.out.println(lista.toArray()[0] == 100);
		lista.insert(200);
		System.out.println(lista.size() == 2);
		System.out.println(lista.toArray()[0] == 200);
		System.out.println(lista.toArray()[1] == 100);
		lista.insert(300);
		System.out.println(lista.size() == 3);
		System.out.println(lista.toArray()[0] == 300);
		System.out.println(lista.toArray()[1] == 200);
		System.out.println(lista.toArray()[2] == 100);
		lista.remove(100);
		System.out.println(lista.size() == 2);
		System.out.println(lista.toArray()[0] == 300);
		System.out.println(lista.toArray()[1] == 200);
		lista.remove(300);
		System.out.println(lista.size() == 1);
		System.out.println(lista.toArray()[0] == 200);
		System.out.println(lista.search(200) == 200);
		System.out.println();
		
		
		//OBS.: Espera-se que nenhum print mostre 'false' na tela!
		
	}
	

}
