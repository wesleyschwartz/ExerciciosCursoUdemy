package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data() {
        //this.dia = 1;
        //this.mes = 1;
        //this.ano = 1970;
        this(1, 1, 1970);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String montarData() {

        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    String montarData2() {
        final String formato = ("%d/%d/%d");
        return String.format(formato, dia, mes, ano);
    }
}
