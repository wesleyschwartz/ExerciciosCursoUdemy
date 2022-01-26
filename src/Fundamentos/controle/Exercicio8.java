package Fundamentos.controle;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//8. Criar um programa que receba uma palavra e imprime no console letra por letra.
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a palavra");
        String palavra = ler.nextLine();
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
    }
}
