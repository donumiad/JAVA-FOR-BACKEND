import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<TempMedia> minhaTempMedia = new ArrayList<>();

        minhaTempMedia.add(new TempMedia("janeiro", 45));
        minhaTempMedia.add(new TempMedia("fevereiro", 40.5));
        minhaTempMedia.add(new TempMedia("Março", 39.8));
        minhaTempMedia.add(new TempMedia("Abril", 35.0));
        minhaTempMedia.add(new TempMedia("Maio", 38.9));
        minhaTempMedia.add(new TempMedia("Junho", 43.6));

        //System.out.println(minhaTempMedia);
        
        Iterator<TempMedia> iterator = minhaTempMedia.iterator();
        Double soma = 0.0;
        double media = 0.0;

        while (iterator.hasNext()) {
            TempMedia next = iterator.next();
            soma += next.getTemperaturaMedia();
        }

        media = soma/6.0;

        for(int i = 0; i < minhaTempMedia.size(); i++){
            if (minhaTempMedia.get(i).getTemperaturaMedia() > media) {
                System.out.println(minhaTempMedia.get(i).getMes());
            }
        }
        

        System.out.print("\nMédia: ");
        System.out.println(media);
        


    }
}
