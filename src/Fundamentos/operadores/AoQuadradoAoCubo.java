package Fundamentos.operadores;

import java.util.Scanner;

public class AoQuadradoAoCubo
{
    public static void main(String[] args) {
        //Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de x");
        Double x =  ler.nextDouble();

        System.out.printf(" O valor de x² é: %.0f", Math.pow(x,2));
        System.out.printf("\n O valor de x³ é: %.0f", Math.pow(x,3));
        ler.close();

    }
}
