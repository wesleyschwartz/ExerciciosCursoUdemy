package Fundamentos.operadores;

import java.util.Scanner;

public class AreaTriangulo {
     //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Digite o valor da base");
         Double base = ler.nextDouble();
         System.out.println("Digite o valor da altura");
         Double alt = ler.nextDouble();
         Double area =  (base*alt)/2;
         System.out.printf("O valor da área do triângulo é: %.2f ", area);
     }
}
