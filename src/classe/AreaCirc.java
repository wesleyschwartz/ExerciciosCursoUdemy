package classe;

public class AreaCirc {
    double raio;
    final static double PI = 3.14;

    public AreaCirc() {
    }

    public AreaCirc(double raio) {
        this.raio = raio;
    }

    double area() {
        return raio * raio * PI;
    }
    static double area(double raio) {
        return raio * raio * PI;
    }
}
