package Fundamentos.controle;

import java.util.Scanner;

//7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos,
// caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        while (numero >= 0) {
            System.out.println("Digite um número, caso negativo irá encerrar o programa");
            numero = ler.nextInt();
            if (numero >= 0) soma += numero;
        }
        System.out.println(soma);
    }
}
