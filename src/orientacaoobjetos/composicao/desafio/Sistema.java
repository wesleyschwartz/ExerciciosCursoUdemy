package orientacaoobjetos.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {


        Produto produto1 = new Produto("PS5", 5000.99);
        Produto produto2 = new Produto("PS4", 2000.99);
        Produto produto3 = new Produto("PS3", 1000.41);


        Item item1 = new Item(1, produto1);
        Item item2 = new Item(2, produto2);
        Item item3 = new Item(3, produto3);

        List<Item> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);

        List<Item> itens2 = new ArrayList<>();
        itens2.add(item2);
        itens2.add(item3);

        Compra compra1 = new Compra(itens);
        Compra compra2 = new Compra(itens2);
        System.out.println(compra1.obterValorCompra());
        System.out.println(compra2.obterValorCompra());

        List<Compra> compras = new ArrayList<>();
        compras.add(compra1);
        compras.add(compra2);

        Cliente cliente1 = new Cliente("Wesley", compras);
        System.out.printf("O cliente %s gastou R$%.2f", cliente1.nome, cliente1.obterValorTotal());

        //professor

        Cliente clienteProf = new Cliente("Professor");
        Compra compraProf1 = new Compra();
        compraProf1.adicionarItem("Caneta", 9.67, 100);
        compraProf1.adicionarItem(2, new Produto("NootBook", 1897.88));
        Compra compraProf2 = new Compra();
        compraProf2.adicionarItem("Caderno", 10.00, 10);
        compraProf2.adicionarItem(1, new Produto("IMpressora", 998.90));

        clienteProf.compras.add(compraProf1);
        clienteProf.adicionarCompra(compraProf2);

        System.out.println("\nO professor gastou R$"+clienteProf.obterValorTotal());

    }
}
