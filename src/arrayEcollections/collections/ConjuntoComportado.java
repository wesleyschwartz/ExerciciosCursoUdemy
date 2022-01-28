package arrayEcollections.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>();
        lista.add("Ana");
        lista.add("Calors");
        lista.add("Luca");
        lista.add("Pedro");
        for (String candidado : lista) {
            System.out.println(candidado);
        }
        Set<Integer> lista2 = new HashSet<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        //lista2.get(3); não é possivel acessar pelo índice
        for (int n : lista2) {
            System.out.print(" "+ n);
        }
    }
}
