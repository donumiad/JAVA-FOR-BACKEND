import QUADRILATEROS.Quadrado;
import QUADRILATEROS.Retangulo;

public class Main {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo = new Retangulo();
        Quadrado quadrado = new Quadrado();

        retangulo.setLadoA(10);
        retangulo.setLadoB(5);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        quadrado.setLadoA(20);
        quadrado.setLadoB(10);
        quadrado.calcularArea();
        quadrado.calcularPerimetro();

        System.out.println("");
        System.out.println(retangulo);
        System.out.println("");
        System.out.println(quadrado);
        System.out.println("");
    }
}
