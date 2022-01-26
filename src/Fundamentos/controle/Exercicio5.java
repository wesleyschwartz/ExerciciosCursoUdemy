package Fundamentos.controle;

import java.util.Scanner;

//5. Refatorar o exercício 04, utilizando a estrutura switch.
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número");
        int numero = ler.nextInt();
        int cont = 0;
        for (int i = 2; i < numero; i++) {
            if (numero % 2 == 1) cont++;
        }
        switch (cont) {
            case 0:
                System.out.println("nao é impar");
                break;
            default:
                System.out.println("é impar");
                break;
        }
    }
}
