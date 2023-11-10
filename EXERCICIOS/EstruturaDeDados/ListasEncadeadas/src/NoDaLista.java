public class NoDaLista<T> {
    
    private T conteudo;
    private NoDaLista proximoNoDaLista;

    
    public NoDaLista() {
        this.proximoNoDaLista = null;
    }


    public NoDaLista(T conteudo) {
        this.proximoNoDaLista = null;
        this.conteudo = conteudo;
    }


    public NoDaLista(T conteudo, NoDaLista proximoNoDaLista) {
        this.proximoNoDaLista = null;
        this.conteudo = conteudo;
        this.proximoNoDaLista = proximoNoDaLista;
    }


    public T getConteudo() {
        return conteudo;
    }


    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }


    public NoDaLista getProximoNoDaLista() {
        return proximoNoDaLista;
    }


    public void setProximoNoDaLista(NoDaLista proximoNoDaLista) {
        this.proximoNoDaLista = proximoNoDaLista;
    }


    @Override
    public String toString() {
        return "NoDaLista [conteudo=" + conteudo + "]";
    }

    public String toStringEncadeado(){
        String str = "NoDaLista [conteudo=" + conteudo + "]";

        if (proximoNoDaLista != null) {
            str += "-->" + proximoNoDaLista.toString();
        }else{
            str += null;
        }
        return str;
    }

    
}
