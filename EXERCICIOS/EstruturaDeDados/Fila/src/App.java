public class App {
    public static void main(String[] args) throws Exception {
        Fila minhaFila =  new Fila();

        minhaFila.enqueue(new NoDaFila("primeiro"));
        minhaFila.enqueue(new NoDaFila("segundo"));
        minhaFila.enqueue(new NoDaFila("terceiro"));
        minhaFila.enqueue(new NoDaFila("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        minhaFila.dequeue();
        System.out.println(minhaFila);

    }
}
