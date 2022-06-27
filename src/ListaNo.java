package listaSimples;

import javax.swing.JOptionPane;

public class ListaNo {

	// a lista está vazia, logo, objeto inicio têm o valor null, o objeto
	// inicio conterá o endereço do primeiro elemento da lista
	static LISTA inicio = null;
	// o objeto fim conterá o endereço do último elemento da lista
	static LISTA fim = null;
	// o objeto aux é um objeto auxiliar
	static LISTA aux;
	// o objeto anterior é um objeto auxiliar
	static LISTA anterior;
	// apresenta o memnu de opções
	static int op, numero, achou;

	// Definindo a classe que representará cada elemento da lista
	private static class LISTA {

		public int num;
		public LISTA prox;
	}

	public static void main(String[] args) {

		do {
			op = Integer.parseInt(JOptionPane
					.showInputDialog("1 - Inserir no início da lista \n"
							+ "2 - Inserir no final da lista \n"
							+ "3 - Consultar toda a lista \n"
							+ "4 - Remover da lista \n"
							+ "5 - Esvaziar a lista \n" + "6 - Sair \n"
							+ "Digite sua opção:"));

			if (op < 1 || op > 6) {
				JOptionPane.showInputDialog("Opção Invalida!");
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
						.showInputDialog("Digite o número a ser inserido no início da lista"));
		if (inicio == null) {
			// a lista esta vazia e o elemento inserido será o
			// primeiro e o último da lista
			inicio = novo;
			fim = inicio;
			novo.prox = null;
		} else {
			// a lista já cont[em elementos e o novo elemento será
			// inserido no início da lista
			novo.prox = inicio;
			inicio = novo;
		}
		JOptionPane.showMessageDialog(null,
				"Número inserido no início da lista!!", "Inserir Lista",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static void inserirFim() {
		LISTA novo = new LISTA();
		novo.num = Integer
				.parseInt(JOptionPane
						.showInputDialog("Digite o número a ser inserido no fim da lista"));
		;
		if (inicio == null) {
			// a lista estava vazia e o elemento inserido será o
			// primeiro e o último
			inicio = novo;
			fim = novo;
			novo.prox = null;
		} else {
			// a lista já contém elementos e o novo elemento será
			// inserido no fim da lista
			fim.prox = novo;
			fim = novo;
			fim.prox = null;
		}
		JOptionPane.showMessageDialog(null,
				"Número inserido no fim da lista!!", "Inserir Lista",
				JOptionPane.PLAIN_MESSAGE);
	}

	public static void exibeLista() {
		if (inicio == null) {
			// a lista está vazia
			JOptionPane.showMessageDialog(null, "Lista  Vazia!!", "ERRO",
					JOptionPane.ERROR_MESSAGE);
		} else {
			// a lista contém elementos e estes serão mostrados do
			// início ao fim
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
			// a lista está vazia
			JOptionPane.showMessageDialog(null, "Lista vazia!!", "Lista",
					JOptionPane.PLAIN_MESSAGE);
		} else {
			// a lista contém elementos e o elmento a ser removido
			// deve ser digitado
			numero = Integer.parseInt(JOptionPane
					.showInputDialog("Digite um numero a ser removido"));
			// numero = entrada.nextInt();
			// todos as ocorrências da lista, iguais ao número
			// digitado serão removidas
			aux = inicio;
			anterior = null;
			achou = 0;
			while (aux != null) {
				if (aux.num == numero) {
					// o número digitado foi encontrado na lista e
					// será removido
					achou = achou + 1;
					if (aux == inicio) {
						// o número a ser removido é o primeiro da
						// lista
						inicio = aux.prox;
						aux = inicio;
					} else if (aux == fim) {
						// o número a ser removido é o último da
						// lista
						anterior.prox = null;
						fim = anterior;
						aux = null;
					} else {
						// o número a ser removido está no meio da
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
				JOptionPane.showMessageDialog(null, "Elemento não encontrado");
			} else if (achou == 1) {
				JOptionPane.showMessageDialog(null, "Número removido 1 vez");
			} else {
				JOptionPane.showMessageDialog(null, "Número removido 1 vez"
						+ achou + " vezes");

			}
		}
	}

	public static void esvaziaLista() {
		if (inicio == null) {
			// a lista está vazia
			JOptionPane.showMessageDialog(null, "Lista vazia!!");
		} else {
			// a lista será esvaziada
			inicio = null;
			JOptionPane.showMessageDialog(null, "Lista esvaziada!!");
		}
	}

}