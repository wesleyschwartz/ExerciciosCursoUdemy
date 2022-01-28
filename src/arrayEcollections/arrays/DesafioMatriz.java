package arrayEcollections.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioMatriz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantida de alunos");
        int qtdAlunos = ler.nextInt();
        System.out.println("Digite a quantida de notas");
        int qtdNotas = ler.nextInt();
        double[][] alunos = new double[qtdAlunos][qtdNotas];
        double total = 0;
        for (int a = 0; a < alunos.length; a++) {
            for (int n = 0; n < alunos[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d:", n + 1, a + 1);
                alunos[a][n] = ler.nextDouble();
                total += alunos[a][n];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Media da turma é " + media);
        double[] media1= new double[qtdAlunos];
        for (int i = 0; i < alunos.length/*qtdAlunos*/; i++) {
            for (int j = 0; j < alunos[j].length/*qtdNotas*/; j++) {
               media1[i] += alunos[i][j];
            }
            System.out.printf("\naluno %d media %.2f ",(i + 1), (media1[i] / qtdNotas));
        }
        ler.close();
    }
}
