package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioLista {

    public static void main(String[] args) {
        List<String> nome =  new ArrayList<>();

        nome.add("Juliana");
        nome.add("Pedro");
        nome.add("Carlos");
        nome.add("Larissa");
        nome.add("João");
        System.out.println(nome);

        // Substituindo o nome Carlos por Robero
        nome.set(2, "Roberto");
        System.out.println(nome);

        // Retornando o nome da posição 1
        System.out.println(nome.get(1));

        //Removendo o nome da posição 4
        nome.remove(4);
        System.out.println(nome);

        // Retornando a quantidade de itens na lista
        int tamanho = nome.size();
        System.out.println(tamanho);

        //Verificando se o nome Juliano existe
        boolean existe = nome.contains("Juliano");
        System.out.println(existe);

        // Criando uma nova lista e adicionando na lista antiga
        List<String> nome2 = new ArrayList<>();
        nome2.add("Ismael");
        nome2.add("Rodrigo");
        System.out.println(nome2);

        nome.addAll(nome2);
        System.out.println(nome);

        // Colocando a lista em ordem alfabética
        Collections.sort(nome);
        System.out.println(nome);

        // Verificando se a lista esta vazia.
        boolean vazia = nome.isEmpty();
        System.out.println(vazia);

    }

}
