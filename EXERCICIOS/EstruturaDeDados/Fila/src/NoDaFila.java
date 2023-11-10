public class NoDaFila<T> {
    
    private T object;
    private NoDaFila<T> refProximoNoDaFila;

    public NoDaFila(){
    }

    public NoDaFila(T object) {
        this.refProximoNoDaFila = null;
        this.object = object;
    }


    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoDaFila<T> getRefProximoNoDaFila() {
        return refProximoNoDaFila;
    }

    public void setRefProximoNoDaFila(NoDaFila<T> refProximoNoDaFila) {
        this.refProximoNoDaFila = refProximoNoDaFila;
    }

    @Override
    public String toString() {
        return "No [object=" + object + "]";
    }
    
    

    

}
