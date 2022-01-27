package classe.desafiomodulo;

public class Pessoa {
    double pesoPessoa;
    String nomePessoa;

    public Pessoa(double pesoPessoa, String nomePessoa) {
        this.pesoPessoa = pesoPessoa;
        this.nomePessoa = nomePessoa;
    }

    double comer(Comida comida ){
        return this.pesoPessoa += comida.pesoComida;
    }
    String apresentar(){
        return "Olá meu nome é " + nomePessoa + " e tenho " + pesoPessoa + "Kgs";
    }
}
