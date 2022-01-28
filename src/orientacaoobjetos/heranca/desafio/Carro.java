package orientacaoobjetos.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    protected double velocidadeAtual = 0;
    protected int valorAcelarado = 15;

    Carro(int velocidade_maxima) {
        VELOCIDADE_MAXIMA =velocidade_maxima;
    }

    public double acelerar() {
        if (velocidadeAtual +valorAcelarado > VELOCIDADE_MAXIMA) {
            return velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            return velocidadeAtual += valorAcelarado;
        }
    }

    public double frear() {
        if (velocidadeAtual >= 5) {
            return velocidadeAtual -= 5;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Velocidade: " + velocidadeAtual + " Km/H";
    }
}
