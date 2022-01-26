package Fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        double n1 = ler.nextDouble();
        System.out.println("Digite o segundo número");
        double n2 = ler.nextDouble();
        System.out.println(" Digite a operação  | +, -, /, *,  %|");
        String op = ler.next();

        double resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1 - n2 : resultado;
        resultado = "/".equals(op) ? n1 / n2 : resultado;
        resultado = "*".equals(op) ? n1 * n2 : resultado;
        resultado = "%".equals(op) ? n1 % n2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resultado);
        ler.close();
    }
}
