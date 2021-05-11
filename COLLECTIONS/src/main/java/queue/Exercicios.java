package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicios {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        for (String mostrar : fila){
            System.out.println(mostrar);
        }

        String primeiroFila = fila.peek();
        System.out.println("1° " + primeiroFila);

        String removerPrimeiro = fila.poll();
        System.out.println(removerPrimeiro);

        fila.add("Daniel");
        System.out.println(fila);

        System.out.println(fila.size());

        System.out.println(fila.isEmpty());

        System.out.println(fila.contains("Carlos"));
    }
}
