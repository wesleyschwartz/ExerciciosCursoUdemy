package orientacaoobjetos.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    protected double velocidadeAtual = 0;
    private int valorAcelarado = 15;

    public int getValorAcelarado() {
        return valorAcelarado;
    }

    public void setValorAcelarado(int valorAcelarado) {
        this.valorAcelarado = valorAcelarado;
    }

    Carro(int velocidade_maxima) {
        VELOCIDADE_MAXIMA = velocidade_maxima;
    }

    public double acelerar() {
        if (velocidadeAtual + getValorAcelarado() > VELOCIDADE_MAXIMA) {
            return velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            return velocidadeAtual += getValorAcelarado();
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
