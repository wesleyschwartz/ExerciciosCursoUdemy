package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {


        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Beto", 5.8);
        Aluno a3 = new Aluno("Carlos", 9.8);
        Aluno a4 = new Aluno("Dadinho", 6.8);
        Aluno a6 = new Aluno("Fer", 7.8);
        Aluno a7 = new Aluno("Gus", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a6, a7);


        alunos.stream()
                .filter(aluno -> aluno.nota >= 7)
                .map(aluno -> "Parabéns você passou !!! " + aluno.nome + " com nota " + aluno.nota)
                .forEach(System.out::println);
        System.out.println("Outra maneira");

        Predicate<Aluno> aprovado =
                aluno -> aluno.nota >= 7;
        Function<Aluno, String> saudacaoAprovado =
                aluno -> "Parabéns você passou !!! " + aluno.nome + " com nota " + aluno.nota;
        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
