package Fundamentos.operadores;

import java.util.Scanner;

public class EquacoesSegundoGrau {
   //Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
   // utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o a");
        double a = ler.nextDouble();
        System.out.println("Digite o b");
        double b= ler.nextDouble();
        System.out.println("Digite o c");
        double c = ler.nextDouble();

        double delta = (Math.pow(b, 2)) + (-4 * a * c);
        double x1 =  (- b  +  Math.sqrt(delta))/(2*a);
        double x2 =  (- b  -  Math.sqrt(delta))/(2*a);
        System.out.println("Resultado de x1 é " + x1);
        System.out.println("Resultado de x2 é " + x2);

    }
}
