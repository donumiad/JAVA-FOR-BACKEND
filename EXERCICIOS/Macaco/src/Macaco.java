public class Macaco {
    private String bucho = "";
    private String nome = "";

    
    
    public void comer(String comida){
        bucho += comida;
    }
    
    public void verBucho(){
        System.out.println(bucho);
    }
    
    public void digerir(){
        bucho = "";
    }

    public String getBucho() {
        return bucho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
