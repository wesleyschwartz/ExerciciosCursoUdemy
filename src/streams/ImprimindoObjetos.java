package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Fe", "Ana", "Vic");

        System.out.println("usando foreach tradicional");
        for (String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("\n usando Iterator...");
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n usando Stream...");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço interno!!!
    }
}
