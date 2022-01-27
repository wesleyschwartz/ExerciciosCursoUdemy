package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        int a = 3;
        Produto p1 = new Produto("Nootbook", 4631.89);

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;

        Produto.desconto = 0.5;

        System.out.printf("\nO(A) %s vale R$%.2f com o desconto vai ficar por R$%.2f  ",
                (p1.nome), p1.preco, p1.precoComDesconto());
        System.out.printf("\nO(A) %s vale R$%.2f  com desconto o vai ficar por R$%.2f  ",
                (p2.nome), p2.preco, p2.precoComDesconto(0.6));
        System.out.printf("\nValor final do carinnho: %.2f", p1.precoComDesconto() + p2.precoComDesconto(0.6));
        System.out.printf("\nValor médio do carinnho: %.2f", (p1.precoComDesconto() + p2.precoComDesconto(0.6)) / 2);


    }
}
