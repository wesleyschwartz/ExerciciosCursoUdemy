package streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Carro argo = new Carro("Argo", 11.5, 73817.0);
        Carro hb20 = new Carro("Hb20", 11.8, 67390.0);
        Carro mobi = new Carro("Mobi", 13.8, 47348.0);
        Carro onix = new Carro("Onix", 12.9, 70590.0);
        Carro kwid = new Carro("Kwid", 14.9, 48790.0);

        List<Carro> carros = Arrays.asList(argo, hb20, mobi, onix, kwid);

        Predicate<Carro> economico =
                carroEco -> carroEco.kmPorLitro >= 12.0;

        Predicate<Carro> barato =
                carroBar -> carroBar.preco <= 70600;

        Function<Carro, String> ehEconomicoEBarato =
                carro -> carro.nome + " é muito barato, custando R$" + carro.preco + " e ainda ele é economico, fazendo: " + carro.kmPorLitro + "km/l";
        Function<Carro, String> ehBarato =
                carro -> carro.nome + " é muito barato, custando R$" + carro.preco;
        Function<Carro, String> ehEconomico =
                carro -> carro.nome + " faz " + carro.kmPorLitro + "km/l";

        System.out.println("Barato");
        carros.stream()
                .filter(barato)
                .map(ehBarato)
                .forEach(System.out::println);
        System.out.println("Economico");
        carros.stream()
                .filter(economico)
                .map(ehEconomico)
                .forEach(System.out::println);
        System.out.println("Eco e barato");
        carros.stream()
                .filter(barato)
                .filter(economico)
                .map(ehEconomicoEBarato)
                .forEach(System.out::println);
    }
}
