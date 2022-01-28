package arrayEcollections.collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {


        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Teste1"));
        lista.add(new Usuario("Cabeca"));
        lista.add(new Usuario("Pikachu"));
        lista.add(new Usuario("Pikachu"));


        System.out.println(lista.remove(1));

        System.out.println("remove " + lista.remove(new Usuario("Cabeca")));
        System.out.println(lista.get(2)); //acessar pelo indice

        System.out.println("tem ?? " + lista.contains(new Usuario("Ana")));

        for (Usuario u : lista) {
            System.out.println(u + " ");
        }

    }
}
