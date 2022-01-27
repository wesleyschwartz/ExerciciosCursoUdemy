package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(5.6);
        AreaCirc a2 = new AreaCirc();
        a2.raio = 3;
        System.out.println(a.area());
        System.out.println(a2.area());
        System.out.println(AreaCirc.area(2));
        System.out.println(a2.area());
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}
