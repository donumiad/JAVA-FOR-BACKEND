public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaEnc = new ListaDuplamenteEncadeada<>();

        minhaListaEnc.add("index0");
        minhaListaEnc.add("index1");
        minhaListaEnc.add("index2");
        minhaListaEnc.add("index3");
        minhaListaEnc.add("index4");

        System.out.println(minhaListaEnc);

        minhaListaEnc.remove(0);

        System.out.println(minhaListaEnc);
        minhaListaEnc.add(4,"99");

        System.out.println(minhaListaEnc);
    }
}
