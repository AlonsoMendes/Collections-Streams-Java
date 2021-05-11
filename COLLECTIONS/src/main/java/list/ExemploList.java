package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Giovana");
        nomes.add("Alonso");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("And");
        nomes.add("Aline");

        System.out.println(nomes);

        nomes.set(2, "Michele");
        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.remove(5);
        System.out.println(nomes);

        nomes.remove("João");
        System.out.println(nomes);

        String nome = nomes.get(3);
        System.out.println(nome);

        int posicao = nomes.indexOf("Pedro");
        System.out.println(posicao);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("And");
        System.out.println(nomes);

        tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temAlonso = nomes.contains("Alonso");
        System.out.println(temAlonso);

        boolean temAnd = nomes.contains("And");
        System.out.println(temAnd);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes){
            System.out.println("-->"+ nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println("---->" + iterator.next());
        }

        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

    }
}
