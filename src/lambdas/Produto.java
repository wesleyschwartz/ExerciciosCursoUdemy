package lambdas;

import java.util.function.UnaryOperator;

public class Produto {
    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "\n Produto: " + nome
                +"\t Preço: " + preco
                +"\t Desconto: " + desconto*100 +"%";
    }


}
