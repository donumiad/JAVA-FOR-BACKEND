package DADOS_COMUNS;

public abstract class DadosQuadrilatero {

    private double LadoA = 0d;
    private double LadoB = 0d;
    private double area = 0d;
    private double perimetro = 0d;

    public void calcularArea(){
        area = LadoA * LadoB;
    }
    public void calcularPerimetro(){
        perimetro = LadoA + LadoB + LadoA + LadoB;
    }

    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }
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
        return "DadosQuadrilatero [LadoA=" + this.LadoA +
                                ", LadoB=" + this.LadoB + 
                                ", area=" + this.area + 
                                ", perimetro=" + this.perimetro
                + "]";
    }
    

}


