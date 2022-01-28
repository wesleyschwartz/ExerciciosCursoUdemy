package orientacaoobjetos.heranca;

import java.time.Month;

public class Monstro extends Jogador {
    public Monstro() {
        this(0, 0);
    }
    protected Monstro(int x, int y){
        super(x,y);
    }
}
