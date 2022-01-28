package orientacaoobjetos.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    final String nome;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome, List<Compra> compras) {
        this.nome = nome;
        this.compras = compras;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
    // metodo feito pelo prof
    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }
    double obterValorTotal() {
        double soma = 0;
        for (Compra compra : compras) {
            soma += compra.obterValorCompra();
        }
        return soma;
    }


}
