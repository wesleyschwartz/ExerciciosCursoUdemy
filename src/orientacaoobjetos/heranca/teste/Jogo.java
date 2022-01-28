package orientacaoobjetos.heranca.teste;

import orientacaoobjetos.heranca.Direcao;
import orientacaoobjetos.heranca.Heroi;
import orientacaoobjetos.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Heroi heroi =new Heroi(10,11);

        Monstro monstro =new Monstro();
        monstro.x = 10;
        monstro.y =11;



        System.out.println("Vida do heroi ==> " + heroi.vida);
        System.out.println("Vida do monstro ==> " + monstro.vida);

        heroi.atacar(monstro);
        monstro.atacar(heroi);
        System.out.println("Vida do heroi ==> " + heroi.vida);
        System.out.println("Vida do monstro ==> " + monstro.vida);

        heroi.atacar(monstro);
        monstro.atacar(heroi);
        System.out.println("Vida do heroi ==> " + heroi.vida);
        System.out.println("Vida do monstro ==> " + monstro.vida);

        monstro.andar(Direcao.NORTE);

        heroi.atacar(monstro);
        monstro.atacar(heroi);
        System.out.println("Vida do heroi ==> " + heroi.vida);
        System.out.println("Vida do monstro ==> " + monstro.vida);
    }
}

