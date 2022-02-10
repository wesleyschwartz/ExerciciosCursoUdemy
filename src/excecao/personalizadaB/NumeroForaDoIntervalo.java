package excecao.personalizadaB;
public class NumeroForaDoIntervalo extends Exception{
    public String nomeDoAtributo;
    public NumeroForaDoIntervalo(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }
    public String getMessage(){
        return String.format("O atributo %s está fora do intervalo", nomeDoAtributo);
    }

}
