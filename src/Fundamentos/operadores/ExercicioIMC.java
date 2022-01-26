package Fundamentos.operadores;

import java.util.Scanner;

public class ExercicioIMC {
    public static void main(String[] args) {
        //Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a altura");
        Double alt = ler.nextDouble();
        System.out.println("Digite o peso");
        Double pes = ler.nextDouble();

        Double imc = pes / Math.pow(alt, 2);

        System.out.printf("%.2f", imc);
    }

}
