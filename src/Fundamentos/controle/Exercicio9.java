package Fundamentos.controle;

import java.util.Scanner;

// * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Integer guardar = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número");
            int n = ler.nextInt();
            if (n > guardar) {
                guardar = n;
            }
        }
        System.out.println(guardar);
    }
}
