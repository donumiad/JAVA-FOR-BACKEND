public class Fila {
    
    private NoDaFila refNoDeEntrada;

    public Fila(){
        this.refNoDeEntrada = null;
    }

    public void enqueue(NoDaFila novoNo){
        novoNo.setRefProximoNoDaFila(refNoDeEntrada);
        refNoDeEntrada = novoNo;
    }

    public NoDaFila first(){
        if (!this.isEmpty()) {
            NoDaFila primeiroNoDaFila = refNoDeEntrada;
            while (true) {
                if (primeiroNoDaFila.getRefProximoNoDaFila() != null) {
                    primeiroNoDaFila = primeiroNoDaFila.getRefProximoNoDaFila();
                }else{
                    break;
                }
            }
            return primeiroNoDaFila;
        }
        return null;
    }

    public NoDaFila dequeue(){
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
            return primeiroNoDaFila;
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
