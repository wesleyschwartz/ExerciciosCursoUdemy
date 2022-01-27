package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();

        Data data2 = new Data(10,12,1995);


        //System.out.print(data1.dia + "/" + data1.mes + "/" + data1.ano);
        System.out.println(data1.montarData());
        System.out.println(data2.montarData2());
    }
}



