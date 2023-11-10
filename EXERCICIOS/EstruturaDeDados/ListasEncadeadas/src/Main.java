public class Main {
    public static void main(String[] args) {
        
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("index0");
        minhaListaEncadeada.add("index1");
        minhaListaEncadeada.add("index2");
        minhaListaEncadeada.add("index3");

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(4);

        System.out.println(minhaListaEncadeada);

    }
}
