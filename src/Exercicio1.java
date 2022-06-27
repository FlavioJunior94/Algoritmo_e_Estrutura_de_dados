package aula.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		double nota1;
		double nota2;
		nota1 = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a nota 1 :"));
		nota2 = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a nota 2 :"));

		double media = ((nota1 * 6) + (nota2 * 4)) / (6 + 4);

		JOptionPane.showMessageDialog(null, "A média Ponderada = " + media);

	}
}
