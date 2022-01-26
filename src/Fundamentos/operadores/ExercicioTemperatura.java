package Fundamentos.operadores;

import java.util.Scanner;

public class ExercicioTemperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
        double c;
        double f;

        System.out.println("Digite a temperatura em Fahrenheit para ser convertida em celsius");
        f = ler.nextDouble();
        c = (f - 32) * 5 / 9;
        System.out.printf("%.2f Fª em Cª é %.2f ", f,  c );
        //Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
        System.out.println("\nAgora digite a temperatura em Celsius e converta para Fahrenheit");
        double ce;
        double fa;
        ce =  ler.nextDouble();
        fa = ce*(9/5) + 32;
        System.out.printf("%.2f Cª em Fª é %.2f ", ce,  fa );
        ler.close();
    }
}
