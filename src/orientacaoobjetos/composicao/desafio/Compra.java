package orientacaoobjetos.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    Compra(List<Item> itens) {
        this.itens = itens;
    }

    public Compra() {
    }

    // metodo feito pelo prof
    void adicionarItem(int qtd, Produto p) {
        this.itens.add(new Item(qtd, p));
    }
    //metodo feito pelo prof
    void adicionarItem(String nome, double preco, int qtd) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(qtd, produto));
    }

    double obterValorCompra() {
        double soma = 0;
        for (Item item : itens) {
            soma += item.qtdProduto * item.produto.preco;
        }
        return soma;
    }


}
