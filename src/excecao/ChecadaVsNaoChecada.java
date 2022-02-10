package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim :)");
    }
    //Exceção checada ou verificada
    private static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal #02!");
    }
    // Não checada ou não verificada
    private static void geraErro1(){
        try {
            throw new RuntimeException("Ocorreu um erro bem legal 01");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
