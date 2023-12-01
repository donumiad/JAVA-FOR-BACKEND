package dio.com.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    
    public Curso() {
    }

    @Override
    public double calculaXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Monitoria [Titulo: " + getTitulo() + 
                          ", Carga horaria: "+ cargaHoraria +
                          ", Descricao: "+ getDescricao() +" ]";
    }

   
}
