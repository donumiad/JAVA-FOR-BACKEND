
import dio.com.desafio.dominio.Bootcamp;
import dio.com.desafio.dominio.Curso;
import dio.com.desafio.dominio.Dev;
import dio.com.desafio.dominio.Monitoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("JAVA");
        curso.setCargaHoraria(4);
        curso.setDescricao("Curso básico de java");

        Curso curso1 = new Curso();
        curso1.setTitulo("spring");
        curso1.setCargaHoraria(6);
        curso1.setDescricao("Curso básico de spring");

        Monitoria monitoria = new Monitoria();
        monitoria.setTitulo("Entendendo POO");
        monitoria.setData(20240226);
        monitoria.setDescricao("Aprendo o que é POO");


        Dev devRaimundo = new Dev("Raimundo");
        Dev devRubens = new Dev("Rubens");
        Dev devMarcos = new Dev("Marcos");

        Bootcamp javaBootcamp = new Bootcamp();
        javaBootcamp.setNome("Java e spring");
        javaBootcamp.setDescricao("Aprenda java e spring");
        javaBootcamp.getConteudos().add(curso);
        javaBootcamp.getConteudos().add(curso1);
        javaBootcamp.getConteudos().add(monitoria);

        devRaimundo.inscricaoBootcamp(javaBootcamp);

        System.out.println(devRaimundo.getConteudosIncritos());


    }

}
