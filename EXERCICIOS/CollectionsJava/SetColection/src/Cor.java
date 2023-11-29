public class Cor implements Comparable<Cor>{
    private String cor = "";

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Cor [cor=" + cor + "]";
    }

    public Cor(String cor) {
        this.cor = cor;
    }

    @Override
    public int compareTo(Cor o) {
        int comparador = this.getCor().compareTo(o.getCor());
        return comparador;
    }
    
}
