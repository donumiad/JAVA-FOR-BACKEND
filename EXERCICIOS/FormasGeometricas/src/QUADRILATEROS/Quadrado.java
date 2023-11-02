package QUADRILATEROS;

import DADOS_COMUNS.DadosQuadrilatero;

public class Quadrado extends DadosQuadrilatero {

  @Override
  public String toString() {
      return "Quadrado [LadoA=" + super.getLadoA() +
                        ", LadoB=" + super.getLadoB() + 
                        ", area=" + super.getArea()+ 
                        ", perimetro=" + super.getPerimetro()+ "]";
  }

}
