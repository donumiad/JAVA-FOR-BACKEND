public class App {
    public static void main(String[] args) throws Exception {
        Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

        macaco1.setNome("marmota1");
        macaco1.setNome("marmota2");

        System.out.println(macaco1.getBucho());
    }
}
