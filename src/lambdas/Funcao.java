package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par " : "Ímpar";
        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
        Function<String, String> empolgado = valor -> valor + "!!!";
        Function<String, String> duvida = valor -> valor + "???";

        System.out.println(parOuImpar.apply(33));
        System.out.println(parOuImpar.apply(32));
        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(33);
        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(32);


        System.out.println(resultadoFinal);
        System.out.println(resultadoFinal2);

    }
}
