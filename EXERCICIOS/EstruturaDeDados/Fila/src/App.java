public class App {
    public static void main(String[] args) throws Exception {
        Fila<String> minhaFila =  new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        minhaFila.dequeue();
        System.out.println(minhaFila);

    }
}
