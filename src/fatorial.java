package Recursividade;
public class fatorial {
	
	public static void main (String [] args) {
		int num = 5;
		System.out.println(fatorialRecusivo(num));
	}
	public static double fatorialRecusivo (int num) {
		if (num ==0)
			return;
		else
			return num * fatorialRecursivo(num -1);
	}
	public static double FatInerativo (int num) {
		double resultado = 1;
		for (int i = num; i>0; i--){
			resultado = resultado *i;
		}
		return resultado;
	}
}
