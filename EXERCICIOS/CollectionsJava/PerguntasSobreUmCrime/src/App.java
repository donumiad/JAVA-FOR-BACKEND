import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Investigador> listaPerguntas = new ArrayList<>();
        int iterador = 0;

        listaPerguntas.add(new Investigador("Telefonou para a vítima?"));
        listaPerguntas.add(new Investigador("Esteve no local do crime?"));
        listaPerguntas.add(new Investigador("Mora perto da Vítima?"));
        listaPerguntas.add(new Investigador("Devia para a vitima?"));
        listaPerguntas.add(new Investigador("Já trabalhou com a vítima?"));

        

        while (iterador < listaPerguntas.size()) {
            


            iterador++;
        }


        System.out.println(listaPerguntas);

    }
}
