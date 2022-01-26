package Fundamentos.controle;

public class DesafioFor {
    public static void main(String[] args) {
        String escada = "#";
        for (int i = 0; i < 5; i++) {
            System.out.println(escada);
            escada += "#";
        }
        System.out.println("outra maneira..");
        for (String x = "#"; !x.equalsIgnoreCase("######") ; x += "#") {
            System.out.println(x);
        }
    }
}
