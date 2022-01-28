package arrayEcollections.arrays;

import java.util.Scanner;

public class DesafioaArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas");
        int qtdNotas = ler.nextInt();
        double[] notas1 = new double[qtdNotas];
        double soma1 = 0;
        System.out.println("Usando for 'tradicional'");
        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas1[i] = ler.nextDouble();

        }
        System.out.println("Usando forEach");
        for (Double nota : notas1) {
            soma1 += nota;
        }
        System.out.println("A média de notas1 é " + soma1 / notas1.length);
        ler.close();
    }
}
