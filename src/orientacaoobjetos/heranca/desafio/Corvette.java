package orientacaoobjetos.heranca.desafio;

public class Corvette extends Carro implements CarroEsportivo, Luxo {
    private boolean turbo =true;
    private boolean ar = true;

    @Override
    public void ligarTurbo() {
        turbo = true;
    }

    @Override
    public void desligarTurbo() {
        turbo = false;
    }

    @Override
    public void ligarAr() {
        ar = true;

    }

    @Override
    public void desligarAr() {
        ar = false;
    }

    @Override
    public int getValorAcelarado() {
        if (turbo && !ar) {
            return 60;
        } else if (turbo && ar) {
            return 55;
        } else if (!turbo && !ar) {
            return 45;
        } else {
            return 30;
        }
    }

    public Corvette() {
        this(315);
    }

    public Corvette(int velocidaMaxima) {
        super(velocidaMaxima);
        this.getValorAcelarado();
    }


}
