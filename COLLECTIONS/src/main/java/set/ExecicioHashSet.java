package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExecicioHashSet {
    public static void main(String[] args) {

        Set<Integer> n = new HashSet<>();

        n.add(3);
        n.add(88);
        n.add(20);
        n.add(44);
        n.add(3);
        System.out.println(n);

        Iterator<Integer> iterator = n.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(n.remove(3));
        System.out.println(n);

        n.add(23);
        System.out.println(n);

        System.out.println(n.size());
        System.out.println(n.isEmpty());


    }
}
