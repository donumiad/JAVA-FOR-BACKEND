//import java.util.Collection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
       Map<String, Double> estado = new HashMap<>();
        estado.put("PE", 9616621d);
        estado.put("AL", 3351543d);
        estado.put("CE", 9187103d);
        estado.put("RN",3534265d);

        System.out.println(estado);

        estado.put("RN",3534165d);

        System.out.println(estado);

        System.out.println(estado.containsKey("PB"));

        estado.put("PB",4039277d);

        System.out.println(estado);

       Set<Map.Entry<String, Double>> buscaPopulacao = estado.entrySet();

       for (Map.Entry<String, Double> achaPopulacao : buscaPopulacao) {
            if (achaPopulacao.getKey().equals("PE")) {
                System.out.println("A população de PE é:" + achaPopulacao.getValue());
            }
       }

       Map<String, Double> estado2 = new LinkedHashMap<>();
        estado2.put("PE", 9616621d);
        estado2.put("AL", 3351543d);
        estado2.put("CE", 9187103d);
        estado2.put("RN",3534265d);
        estado.put("PB",4039277d);

       System.out.println(estado2);

       Map<String, Double> estado3 = new TreeMap<>();

       estado3.putAll(estado);
       System.out.println(estado3);

       Double menorPopulacao = Collections.min(estado3.values());
       Double maiorPopulacao = Collections.max(estado3.values());
       
       Set<Map.Entry<String, Double>> buscaMaiorEMenor = estado3.entrySet();

       for (Map.Entry<String,Double> maiorMenor : buscaMaiorEMenor) {
            if (maiorMenor.getValue().equals(maiorPopulacao)) {
                System.out.println(maiorMenor.getKey() + " Tem a maior população com " + maiorMenor.getValue() +"individuos");
            }
            if (maiorMenor.getValue().equals(menorPopulacao)) {
                System.out.println(maiorMenor.getKey() + " Tem a menor população com " + maiorMenor.getValue() +"individuos");
            }
       }

    }
}
