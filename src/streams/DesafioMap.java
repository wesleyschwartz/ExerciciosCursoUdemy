package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        /*
        1. Numero para String binária... 6 => "110"
        2. Inverter a string... "110" => "011"
        3. Converter de volta para inteiro => "011" => 3
        */
        Consumer<Object> print = System.out::println;

        Function<Integer, String> numeroParaBi =
                binaria -> Integer.toBinaryString(binaria);


        UnaryOperator<String> inverter =
                texto -> {
                    StringBuffer sb = new StringBuffer(texto);
                    sb.reverse();
                    return sb.toString();
                };

        Function<String, Integer> binarioParaInt =
                inteiro -> Integer.parseInt(inteiro, 2);


        System.out.println("\n1. Numero para String binária... 6 => '110'");
        nums.stream().map(numeroParaBi).forEach(print);
        System.out.println("\n2. Inverter a string... '110' => '011'");
        nums.stream().map(numeroParaBi).map(inverter).forEach(print);
        System.out.println("\n3. Converter de volta para inteiro => \"011\" => 3");
        nums.stream().map(numeroParaBi).map(inverter).map(binarioParaInt).forEach(print);


        System.out.println("Do professor");
        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);

    }
}
