import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Cor> arcoIris = new LinkedHashSet<>();
        
        arcoIris.add(new Cor("azul"));
        arcoIris.add(new Cor("vermelho"));
        arcoIris.add(new Cor("laranja"));
        arcoIris.add(new Cor("amarelo"));
        arcoIris.add(new Cor("verde"));
        arcoIris.add(new Cor("anil"));
        arcoIris.add(new Cor("violeta"));

        Set<Cor> arcoIris2 = new TreeSet<>(arcoIris);

        System.out.println(arcoIris);
        System.out.println(arcoIris2);

    }
}

