public class Fila<T> {
    
    private NoDaFila<T> refNoDeEntrada;

    public Fila(){
        this.refNoDeEntrada = null;
    }

    public void enqueue(T obj){
        NoDaFila novoNo = new NoDaFila(obj);
        novoNo.setRefProximoNoDaFila(refNoDeEntrada);
        refNoDeEntrada = novoNo;
    }

    public T first(){
        if (!this.isEmpty()) {
            NoDaFila primeiroNoDaFila = refNoDeEntrada;
            while (true) {
                if (primeiroNoDaFila.getRefProximoNoDaFila() != null) {
                    primeiroNoDaFila = primeiroNoDaFila.getRefProximoNoDaFila();
                }else{
                    break;
                }
            }
            return (T) primeiroNoDaFila.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!this.isEmpty()) {
            NoDaFila primeiroNoDaFila = refNoDeEntrada;
            NoDaFila noAuxiliarDaFila = refNoDeEntrada;
            while (true) {
                if (primeiroNoDaFila.getRefProximoNoDaFila() != null) {
                    noAuxiliarDaFila = primeiroNoDaFila;
                    primeiroNoDaFila = primeiroNoDaFila.getRefProximoNoDaFila();
                }else{
                    noAuxiliarDaFila.setRefProximoNoDaFila(null);
                    break;
                }
            }
            return (T) primeiroNoDaFila.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoDeEntrada == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetornoDaFila = "";
        NoDaFila noAuxiliDaFila = refNoDeEntrada;

        if(refNoDeEntrada != null){
            while (true) {
                stringRetornoDaFila += "No{objeto" + noAuxiliDaFila.getObject() + "}]----->";
                //noAuxiliDaFila = noAuxiliDaFila.getRefProximoNoDaFila();
                if (noAuxiliDaFila.getRefProximoNoDaFila() != null) {
                    noAuxiliDaFila = noAuxiliDaFila.getRefProximoNoDaFila();
                }else{
                    stringRetornoDaFila += "null";
                    break;
                }
            }
        }else{
            stringRetornoDaFila = "NULL";
        }


        return stringRetornoDaFila;
    }


    

}
