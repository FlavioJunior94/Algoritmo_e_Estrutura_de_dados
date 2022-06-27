package aula.exercicios;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class ExercicioDecrecente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int vetor[] = new int[10];
		int vetorDes[] = new int[10];
		Random rnd = new Random();
		String impressao = "";
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rnd.nextInt(500);
			impressao += vetor[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, impressao);
		Arrays.sort(vetor);

		impressao = "";
		for (int i = vetor.length - 1; i >= 0; i--) {
			vetorDes[9 - i] = vetor[i];
			impressao += vetorDes[9-i] + "\n";
		}
		JOptionPane.showMessageDialog(null, impressao);

		boolean verificaDecrescente = true;

		for (int i = 0; i < vetorDes.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetorDes[i] < vetorDes[j]) {
					verificaDecrescente = false;
					break;
				}
			}

			if (verificaDecrescente == false)
				break;

		}

		if (verificaDecrescente == true)
			JOptionPane.showMessageDialog(null, "Vetor Decrescente !");
		else
			JOptionPane.showMessageDialog(null, "ERRO !!!!!!!!!!!!!");

	}

}
