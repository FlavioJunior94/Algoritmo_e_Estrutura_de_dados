package listaSimples;

import javax.swing.JOptionPane;

public class ListaNo {

	// a lista est� vazia, logo, objeto inicio t�m o valor null, o objeto
	// inicio conter� o endere�o do primeiro elemento da lista
	static LISTA inicio = null;
	// o objeto fim conter� o endere�o do �ltimo elemento da lista
	static LISTA fim = null;
	// o objeto aux � um objeto auxiliar
	static LISTA aux;
	// o objeto anterior � um objeto auxiliar
	static LISTA anterior;
	// apresenta o memnu de op��es
	static int op, numero, achou;

	// Definindo a classe que representar� cada elemento da lista
	private static class LISTA {

		public int num;
		public LISTA prox;
	}

	public static void main(String[] args) {

		do {
			op = Integer.parseInt(JOptionPane
					.showInputDialog("1 - Inserir no in�cio da lista \n"
							+ "2 - Inserir no final da lista \n"
							+ "3 - Consultar toda a lista \n"
							+ "4 - Remover da lista \n"
							+ "5 - Esvaziar a lista \n" + "6 - Sair \n"
							+ "Digite sua op��o:"));

			if (op < 1 || op > 6) {
				JOptionPane.showInputDialog("Op��o Invalida!");
			} else {
				if (op == 1) {
					inserirInicio();
				}
				if (op == 2) {
					inserirFim();
				}
				if (op == 3) {
					exibeLista();
				}
				if (op == 4) {
					rwmoveLista();
				}
				if (op == 5) {
					esvaziaLista();
				}

			}

		} while (op != 6);

	}

	public static void inserirInicio() {
		LISTA novo = new LISTA();
		novo.num = Integer
				.parseInt(JOptionPane
						.showInputDialog("Digite o n�mero a ser inserido no in�cio da lista"));
		if (inicio == null) {
			// a lista esta vazia e o elemento inserido ser� o
			// primeiro e o �ltimo da lista
			inicio = novo;
			fim = inicio;
			novo.prox = null;
		} else {
			// a lista j� cont[em elementos e o novo elemento ser�
			// inserido no in�cio da lista
			novo.prox = inicio;
			inicio = novo;
		}
		JOptionPane.showMessageDialog(null,
				"N�mero inserido no in�cio da lista!!", "Inserir Lista",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void inserirFim() {
		LISTA novo = new LISTA();
		novo.num = Integer
				.parseInt(JOptionPane
						.showInputDialog("Digite o n�mero a ser inserido no fim da lista"));
		;
		if (inicio == null) {
			// a lista estava vazia e o elemento inserido ser� o
			// primeiro e o �ltimo
			inicio = novo;
			fim = novo;
			novo.prox = null;
		} else {
			// a lista j� cont�m elementos e o novo elemento ser�
			// inserido no fim da lista
			fim.prox = novo;
			fim = novo;
			fim.prox = null;
		}
		JOptionPane.showMessageDialog(null,
				"N�mero inserido no fim da lista!!", "Inserir Lista",
				JOptionPane.PLAIN_MESSAGE);
	}

	public static void exibeLista() {
		if (inicio == null) {
			// a lista est� vazia
			JOptionPane.showMessageDialog(null, "Lista  Vazia!!", "ERRO",
					JOptionPane.ERROR_MESSAGE);
		} else {
			// a lista cont�m elementos e estes ser�o mostrados do
			// in�cio ao fim
			String impressao = "";
			aux = inicio;
			while (aux != null) {
				impressao += aux.num + "\n";
				aux = aux.prox;
			}

			JOptionPane.showMessageDialog(null, impressao, "Elementos",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public static void rwmoveLista() {
		if (inicio == null) {
			// a lista est� vazia
			JOptionPane.showMessageDialog(null, "Lista vazia!!", "Lista",
					JOptionPane.PLAIN_MESSAGE);
		} else {
			// a lista cont�m elementos e o elmento a ser removido
			// deve ser digitado
			numero = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um numero a ser removido"));
			// numero = entrada.nextInt();
			// todos as ocorr�ncias da lista, iguais ao n�mero
			// digitado ser�o removidas
			aux = inicio;
			anterior = null;
			achou = 0;
			while (aux != null) {
				if (aux.num == numero) {
					// o n�mero digitado foi encontrado na lista e
					// ser� removido
					achou = achou + 1;
					if (aux == inicio) {
						// o n�mero a ser removido � o primeiro da
						// lista
						inicio = aux.prox;
						aux = inicio;
					} else if (aux == fim) {
						// o n�mero a ser removido � o �ltimo da
						// lista
						anterior.prox = null;
						fim = anterior;
						aux = null;
					} else {
						// o n�mero a ser removido est� no meio da
						// lista
						anterior.prox = aux.prox;
						aux = aux.prox;
					}
				} else {
					anterior = aux;
					aux = aux.prox;
				}
			}
			if (achou == 0) {
				JOptionPane.showMessageDialog(null, "Elemento n�o encontrado");
			} else if (achou == 1) {
				JOptionPane.showMessageDialog(null, "N�mero removido 1 vez");
			} else {
				JOptionPane.showMessageDialog(null, "N�mero removido 1 vez"
						+ achou + " vezes");

			}
		}
	}

	public static void esvaziaLista() {
		if (inicio == null) {
			// a lista est� vazia
			JOptionPane.showMessageDialog(null, "Lista vazia!!");
		} else {
			// a lista ser� esvaziada
			inicio = null;
			JOptionPane.showMessageDialog(null, "Lista esvaziada!!");
		}
	}

}