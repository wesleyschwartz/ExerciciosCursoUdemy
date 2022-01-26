package Fundamentos.controle;

import java.util.Scanner;

//6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
// Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado.
// Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = 87;
        String msg = "Você errou todas :( e morreu.";
        System.out.println("Tentar adivinhar um número entre 0 - 100.");
        for (int i = 10; i > 0; i--) {
            System.out.println("Tu tem " + i + " vidas");
            int palpite = ler.nextInt();
            if (palpite == x) {
                msg = "Parabéns tu acertou!";
                break;
            } else if (palpite > x) {
                System.out.println("O número é menor!");
            } else if (palpite < x) {
                System.out.println("O número é maior!");
            }
        }
        System.out.println(msg);
    }


}
