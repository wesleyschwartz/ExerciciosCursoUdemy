package arrayEcollections.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("o pequeno principe");   //add return false se cheia
        livros.push("don quixote");  // push return exception se cheia
        livros.push("o hobbit");
for (String livro: livros){
    System.out.println(livro);

}

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); // poll retorna vazio caso vazio
        System.out.println(livros.pop()); // pop  etorna exception caso vazio
        //System.out.println(livros.remove()); // remove retorna exception caso vazio


    }
}
