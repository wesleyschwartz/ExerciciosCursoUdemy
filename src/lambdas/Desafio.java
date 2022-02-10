package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        /*
         * 1. A partir do produto calcular o preco real (com desconto)
         * 2. Imposto Municipal: >= 2500 (8,5%)/ <2500 (Isento)
         * 3. Frete: >= 3000(100)/ <3000 (50)
         * 4. Arredontar: Deixar duas casas decimais
         * 5. Formatar: R$ 1234,56
         * */


        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);

        UnaryOperator<Double> impostoMunicipal =
                precoImposto -> precoImposto >= 2500 ? precoImposto * (1.085) : precoImposto;

        UnaryOperator<Double> frete =
                precoFrete -> precoFrete >= 3000 ? precoFrete + 100 : precoFrete + 50;
        UnaryOperator<Double> arredondar =
                preco -> {
                    BigDecimal bd = new BigDecimal(preco).setScale(2, RoundingMode.HALF_EVEN);
                    return bd.doubleValue();
                };
        Function<Double, String> formatar =
                precoString -> ("R$ " + precoString).replace(".", ",");

        Produto p = new Produto("iPad", 32535.89, 0.13);
        String preco;
        preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é " + preco);
    }
}
