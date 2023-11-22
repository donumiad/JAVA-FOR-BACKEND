public class Investigador {
    private String perguntas = "";
    private String resposta = "";
    
    public Investigador(String perguntas) {
        this.perguntas = perguntas;
    }
    public String getPerguntas() {
        return perguntas;
    }
    public String getResposta() {
        return resposta;
    }
    @Override
    public String toString() {
        return "Investigador [pergunta=" + perguntas + ", resposta=" + resposta + "]";
    }

    
}
