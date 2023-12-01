
import dio.com.desafio.dominio.Curso;
import dio.com.desafio.dominio.Monitoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("JAVA");
        curso.setCargaHoraria(4);
        curso.setDescricao("Curso básico de java");

        Monitoria monitoria = new Monitoria();
        monitoria.setTitulo("Entendendo POO");
        monitoria.setData(20240226);
        monitoria.setDescricao("Aprendo o que é POO");


    }

}
