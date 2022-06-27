import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Aula {
	/**
	 * @param args
	 * Autor Flavio dos Santos Júnior.
	 */
	public static void main (String[] args){
		List<Integer> listaInteiro = new ArrayList<Integer>();
		Random rnd = new Random();
		int numAleatorio;
		int cont=0;
		 
		for (int i=0; i<1000; i++){
			numAleatorio = rnd.nextInt(10000);
			if (cont <= 100){
				if (numAleatorio % 2 !=0){
					listaInteiro.add(numAleatorio);
					cont++;
				}
			}else{
				break;
				
			}
		}
		cont=0;
		
		for (Integer elementos : listaInteiro){
			System.out.println("Elemento:" + ++cont + " =" + elementos);
			
		}
	}
}
