package Fundamentos.operadores;

import java.sql.SQLOutput;

public class DesafioLogico {
    public static void main(String[] args) {
        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean b = trabalho1 && trabalho2;

            System.out.println("Vamos no shopping comprar TV de 50' " + b);


        boolean c = trabalho1 ^ trabalho2;

            System.out.println("Vamos no shopping comprar TV de 32' " + c );

        boolean d = trabalho1 || trabalho2;

            System.out.println("Vão tomar sorvete " + d);

        System.out.println("mais saúdavel ?? "  + !d);
    }
}
