package aula.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double num1;
		double num2;

		num1 = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o número 1 : "));
		num2 = Double.parseDouble(JOptionPane
				.showInputDialog("Digite o número 2 : "));

		if (num1 > num2)
			JOptionPane.showMessageDialog(null, "O número maior é :" + num1);
		else
			JOptionPane.showMessageDialog(null, "O número maior é :" + num2);
	}

}
