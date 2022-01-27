package controle;

import java.util.Scanner;

//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número para verificar se está entre 0 e 10, e ainda, se é par");
        Integer numero = ler.nextInt();
        if (numero >= 0 && numero <= 10) {
            System.out.println(numero + " está entre 0 e 10");
            if (numero % 2 == 0) System.out.println(numero + " é par");
            else System.out.println("não é par");
        } else System.out.println("não está entre 0  e  10");
        ler.close();
    }
}
