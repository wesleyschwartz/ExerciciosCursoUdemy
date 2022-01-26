package Fundamentos.operadores;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {
        Double a =  6d * (3 + 2);
        Double b = Math.pow(a, 2);
        b = b / (3*2);
        System.out.println(b);
        Double c = ((1-5d)*(2-7))/2;
        Double d = Math.pow(c, 2);
        System.out.println( d );
        Double bd = (b - d );
        bd = Math.pow(bd, 3);
        System.out.println(bd);
        bd = bd/(Math.pow(10,3));
        System.out.println(bd);
    }
}
