package FORMAS;
public class Retangulo {

    private double LadoA = 0d;
    private double LadoB = 0d;

    public double getLadoA() {
        return LadoA;
    }
    public void setLadoA(double ladoA) {
        LadoA = ladoA;
    }
    public double getLadoB() {
        return LadoB;
    }
    public void setLadoB(double ladoB) {
        LadoB = ladoB;
    }
    @Override
    public String toString() {
        return "Retangulo [LadoA=" + LadoA + ", LadoB=" + LadoB + "]";
    }

    

    
}