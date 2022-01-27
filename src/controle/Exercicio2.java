package controle;

//2. Criar um programa informa se o ano atual é um ano bissexto;
public class Exercicio2 {
    public static void main(String[] args) {
        int ano = 5000;
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
            System.out.println("O ano é bissexto");
        } else System.out.println("O ano é normal");
    }
}
