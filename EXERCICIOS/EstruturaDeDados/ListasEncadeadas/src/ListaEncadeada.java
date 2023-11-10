public class ListaEncadeada<T> {
    
    private NoDaLista<T> referenciaDeEntrada;

    public ListaEncadeada(){
        this.referenciaDeEntrada = null;
    }


    public int size(){
        int tamanhoLista = 0;
        NoDaLista<T> referenciaAux = referenciaDeEntrada;

        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNoDaLista() != null) {
                    referenciaAux = referenciaAux.getProximoNoDaLista();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenciaDeEntrada == null ? true : false;
    }

}
