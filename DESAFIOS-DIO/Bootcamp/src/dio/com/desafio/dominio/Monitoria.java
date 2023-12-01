package dio.com.desafio.dominio;


public class Monitoria extends Conteudo {

    private int data;

    @Override
    public double calculaXp() {
        return XP_PADRAO + 20d;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Monitoria [Titulo: " + getTitulo() + 
                          ", Data: "+ data +
                          ", Descricao: "+ getDescricao() +" ]";
    }

    
    
}
