package listaSimples;

import java.util.ArrayList;
import java.util.List;

public class ListaDinamica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listaString = new ArrayList<String>();

		listaString.add("Elemento 1");
		listaString.add("Elemento 2");
		int cont = 2;
		for (int i = 0; i < 10; i++) {
			listaString.add("Elemento :" + ++cont);
		}
		
		for (String elementos : listaString) {
			System.out.println(elementos);
		}

		System.out.println(listaString.isEmpty() + " Numero de Elementos =" + listaString.size());

		
	}

}
