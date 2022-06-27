package aula.exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codigo;
		double precoKW;
		double qtdeKW;
		double valorMinimo = 11.20;
		double valorConsumido;
		
		codigo = JOptionPane.showInputDialog("Digite o Codigo do Cliente.");
		precoKW = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do KW"));
		qtdeKW = Double.parseDouble(JOptionPane.showInputDialog("Digite a qtde de KW utilizada pelo cliente")); 
	
		valorConsumido = precoKW * qtdeKW;
		
		if(valorConsumido < valorMinimo)
			JOptionPane.showMessageDialog(null, "Valor a pagar = " + valorMinimo);

		else
			JOptionPane.showMessageDialog(null, "Valor a pagar cliente = " + codigo + " é "+ valorConsumido);
	}

}
