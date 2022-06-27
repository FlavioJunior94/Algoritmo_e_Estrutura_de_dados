package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listainteiros {
	/**
	 * @param args
	 */

	public static void main (String[]args){
		//TODO auto-generated method stub
		List<Integer>listaInteiros = new ArrayList<Integer>();
		Random rnd=new Random();
		int numAleatorio;
		int cont=0;
		for (int i=0; i<100; i++){
			numAleatorio= rnd.nextInt(10000);
			cont++;
			if(cont>=100){
				break;
			}
			if(numAleatorio %2 !=0){
				listaInteiros.add(numAleatorio);
			}
		}
		for (Integer elementos : listaInteiros){
			System.out.println(elementos);
		}
	}
}
