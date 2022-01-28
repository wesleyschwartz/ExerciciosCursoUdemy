package orientacaoobjetos.heranca.desafio;

public class Corvette extends Carro {

    public Corvette() {
        this(250);
        valorAcelarado = 160;
    }

    protected Corvette(int velocidade_maxima) {
        super(velocidade_maxima);
        valorAcelarado = 160;
    }

}
