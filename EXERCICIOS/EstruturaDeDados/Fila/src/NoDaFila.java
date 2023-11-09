public class NoDaFila {
    
    private Object object;
    private NoDaFila refProximoNoDaFila;

    public NoDaFila(){
    }

    public NoDaFila(Object object) {
        this.refProximoNoDaFila = null;
        this.object = object;
    }


    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public NoDaFila getRefProximoNoDaFila() {
        return refProximoNoDaFila;
    }

    public void setRefProximoNoDaFila(NoDaFila refProximoNoDaFila) {
        this.refProximoNoDaFila = refProximoNoDaFila;
    }

    @Override
    public String toString() {
        return "No [object=" + object + "]";
    }
    
    

    

}
