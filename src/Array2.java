/**
 * @param args
 */

package aula.exercicios;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] vetor = new int[10];
		Random rnd = new Random();
		String impressao = "";
		// 1) Prencher vetor

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rnd.nextInt(500);
			impressao += vetor[i] + "\n";

		}

		// 2) Imprimir vetor
		JOptionPane.showMessageDialog(null, impressao);

		// 3) Vericar se vetor é Par
		impressao = "";
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				impressao += vetor[i] + "\n";

			}
		}
		JOptionPane.showMessageDialog(null, impressao);

		// 4) Crwescente decrescente ou Não Ordendado
		// vetor Crescente
		Arrays.sort(vetor);
		impressao = "";
		for (int i = 0; i < vetor.length; i++) {
			impressao += vetor[i] + "\n";

		}

		JOptionPane.showMessageDialog(null, impressao);

		boolean flag = true;

		for (int i = 0; i < vetor.length - 1; i++) {

			if (vetor[i] > vetor[i + 1]) {
				flag = false;
				break;
			}

		}

		if (flag) {
			JOptionPane.showMessageDialog(null, "Vetor Ordenado");
		} else {
			JOptionPane.showMessageDialog(null, "Vetor Desordenado");
		}

	}

}
