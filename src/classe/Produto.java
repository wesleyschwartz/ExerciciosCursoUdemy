package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double precoComDesconto() {

        return preco * (1 - desconto);
    }

    double precoComDesconto(Double descontoDoGerente) {

        return preco * (1 - (desconto + descontoDoGerente));
    }

    double media(double a, double b) {

        return a + b / 2;
    }

    double valorFinal(double a, double b) {

        return a + b;
    }
}
