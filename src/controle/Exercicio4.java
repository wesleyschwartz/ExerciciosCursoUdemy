package controle;

import java.util.Scanner;

public class Exercicio4 {
    // Criar um programa que receba um número e diga se ele é um número primo.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número");
        int numero = ler.nextInt();
        int cont = 0;
        for (int i = 2; i < numero; i++) {
            if (numero % 2 == 1) cont++;
        }
        if (cont++ == 0)
            System.out.println(numero + "  é impar");
        else System.out.println("nao é impar");
    }
}
