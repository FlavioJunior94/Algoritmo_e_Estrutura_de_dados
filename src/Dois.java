// crie um programa recursivo que faça a soma de numeros ao quadrado de 1 a n elementeos informado pelo usuario:
import java.util.Scanner;
public class Dois {
	public static void main (String [] args) {
	int n1, i, result=0;
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite um numero: ");
	n1 = entrada.nextInt();
	for(i=n1; i!=0; i--){
		result=(i*i)+result;
	}
	System.out.println(result);
	}
}
