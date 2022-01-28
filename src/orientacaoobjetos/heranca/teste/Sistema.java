package orientacaoobjetos.heranca.teste;

import orientacaoobjetos.heranca.desafio.Carro;
import orientacaoobjetos.heranca.desafio.Celta;
import orientacaoobjetos.heranca.desafio.Corvette;

public class Sistema {
    public static void main(String[] args) {
        Carro celta = new Celta();
        Carro corvette = new Corvette();

        System.out.println("Corvette:   " + corvette);
        System.out.println("celta  " + celta);
        System.out.println("\nAcelerando...");
        celta.acelerar();
        corvette.acelerar();
        System.out.println("Corvette:   " + corvette);
        System.out.println("celta  " + celta);

        System.out.println("\nAcelerando...");
        celta.acelerar();
        corvette.acelerar();
        System.out.println("Corvette:   " + corvette);
        System.out.println("celta  " + celta);

        System.out.println("\nFreando...");
        celta.frear();
        corvette.frear();
        System.out.println("Corvette:   " + corvette);
        System.out.println("celta  " + celta);
    }
}
