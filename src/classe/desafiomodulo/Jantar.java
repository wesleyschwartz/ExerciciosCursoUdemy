package classe.desafiomodulo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(80, "Wesley");
        Comida comida1 = new Comida(0.5, "Bauru");
        Comida comida2 = new Comida(0.4, "X");
        System.out.println(pessoa1.apresentar());
        System.out.println("Comi : ");
        System.out.println(comida1.nomeComida + " - Peso: " + comida1.pesoComida);
        pessoa1.comer(comida1);
        System.out.println(pessoa1.apresentar());

        System.out.println("Comi : ");
        System.out.println(comida2.nomeComida + " - Peso: " + comida2.pesoComida);
        pessoa1.comer(comida2);
        System.out.println(pessoa1.apresentar());
    }
}
