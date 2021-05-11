package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();

		filaBanco.add("Pamela");
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Flavio");
		filaBanco.add("Anderson");

		System.out.println(filaBanco);

		// Mostra o primeiro da fila e exclui
		String clienteASerAtendido = filaBanco.poll();
		System.out.println(clienteASerAtendido);

		System.out.println(filaBanco);

		// Mostra o primeiro da fila
		String primeiroCliente = filaBanco.peek();
		System.out.println(primeiroCliente);

		System.out.println(filaBanco);

		// Retorna o primeiro da fila ou se nao tem ninguem na fila
		String primeorClienteOUErro = filaBanco.element();
		System.out.println(primeorClienteOUErro);

		System.out.println(filaBanco);

		// Um for para caminhar na fila
		for(String client: filaBanco){
			System.out.println(client);
		}

		Iterator<String> iteratorFilaBanco = filaBanco.iterator();

		while(iteratorFilaBanco.hasNext()){
			System.out.println("-> " + iteratorFilaBanco.next());
		}

		// Quantidade de elementos da fila
		System.out.println(filaBanco.size());

		filaBanco.clear();
		// Se a fila esta vazia
		System.out.println(filaBanco.isEmpty());

		filaBanco.add("Wesley");

		System.out.println(filaBanco);

	}
}
