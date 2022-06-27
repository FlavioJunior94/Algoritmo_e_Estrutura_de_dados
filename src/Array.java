package aula.exercicios;

import java.util.Random;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetorP = new int[12];
		int[] vetorI = new int[12];
		int contI = 0;
		int contP = 0;
		int numAleatorio;

		Random rnd = new Random();

		for (int i = 0; i < 30; i++) {
			numAleatorio = rnd.nextInt(10000);
			System.out.println(numAleatorio);
			if (numAleatorio % 2 == 0 && contP < 12) {
				vetorP[contP] = numAleatorio;
				contP++;

			} else if (numAleatorio % 2 != 0 && contI < 12) {
				vetorI[contI] = numAleatorio;
				contI++;
			}

			if (contP >= 12)
				break;
			if (contI >= 12)
				break;

		}

		if (contP >= 12) {
			System.out
					.println("####################  IMPRIMINDO VETOR PAR #############");
			for (int i = 0; i < vetorP.length; i++) {
				System.out.println("Vetor :" + vetorP[i]);
			}
		}

		if (contI >= 12) {
			System.out
					.println("####################  IMPRIMINDO VETOR IMPAR #############");
			for (int i = 0; i < vetorI.length; i++) {
				System.out.println("Vetor :" + vetorI[i]);
			}
		}

	}

}
