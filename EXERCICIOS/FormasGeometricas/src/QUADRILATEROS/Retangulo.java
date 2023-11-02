package QUADRILATEROS;

import DADOS_COMUNS.DadosQuadrilatero;

public class Retangulo extends DadosQuadrilatero {
    @Override
    public String toString() {
        return "Retangulo [LadoA=" + super.getLadoA() +
                          ", LadoB=" + super.getLadoB() + 
                          ", area=" + super.getArea()+ 
                          ", perimetro=" + super.getPerimetro()+ "]";
    }
}