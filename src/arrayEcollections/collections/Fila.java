package arrayEcollections.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        //Offer e add -> adicionam elementos na fila
        //diferença é o comportamento quando a fila está cheia
        fila.add("Ana");//quando cheia ADD retorna false e não adiciona na fila
        fila.offer("Bia");//quando cheia offer da uma excpetion
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Gyu");
        fila.offer("rafaela");

        System.out.println(fila.peek()); // quando fila vazia da NULL
        System.out.println(fila.peek());
        System.out.println(fila.element()); // quando fila vazia exception
        System.out.println(fila.element());




        // POOL remove o primeiro elemento da fila retorna null quando vazia
        // REMOVE remove o primeiro elemento da fila retorna exception quando vazia
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());


        // fila.size();
        // fila.clear();
        //fila.isEmpty();
        //fila.contains();

    }
}
