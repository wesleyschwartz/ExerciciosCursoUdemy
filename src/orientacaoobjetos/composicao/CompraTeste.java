package orientacaoobjetos.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "JOao Pedro";
        c1.itens.add(new Item("Caneta", 20, 7.45));
        c1.itens.add(new Item("Borracha", 12, 3.41));
        c1.itens.add(new Item("Caderbi", 3, 9.99));
        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());


    }
}
