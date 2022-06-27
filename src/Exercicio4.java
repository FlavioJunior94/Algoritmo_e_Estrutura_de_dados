package aula.exercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int numAleatorio;
		int numDigitado;
		int numTentativas = 5;
		
		for (int i = 1; i <= numTentativas; i++) {

			numAleatorio = rnd.nextInt(10);

			System.out.println("Numero gerado " +  numAleatorio);
			numDigitado = Integer
					.parseInt(JOptionPane
							.showInputDialog("Escolha um número no intervalo de 0 a 10."));

			if (numAleatorio == numDigitado) {
				JOptionPane.showMessageDialog(null, "Parabéns você brilhou!");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Erro resta "
						+ (numTentativas - i) + " tentativas");
				continue;
			}

		}

	}

}
