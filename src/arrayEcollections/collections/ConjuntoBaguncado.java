package arrayEcollections.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("teste");

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("tes"));
        System.out.println(conjunto.remove("teste"));

        System.out.println(conjunto.contains(('x')));


        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);
        System.out.println(conjunto);

       // conjunto.addAll(nums); // união entre dois conjuntos
        conjunto.retainAll(nums); // valor em comum dos dois conjuntos
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
