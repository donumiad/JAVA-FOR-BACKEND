public class ListaEncadeada<T> {
    
    private NoDaLista<T> referenciaDeEntrada;

    public ListaEncadeada(){
        this.referenciaDeEntrada = null;
    }

    public T get(int index){
        return getNoDaLista(index).getConteudo();
    }

    private NoDaLista<T> getNoDaLista (int index){
        validaIndice(index);
        NoDaLista<T> noAuxiliarDaLista = referenciaDeEntrada;
        NoDaLista<T> noRetorNoDaLista = null;
        for(int i = 0; i <= index; i++){
            noRetorNoDaLista = noAuxiliarDaLista;
            noAuxiliarDaLista = noAuxiliarDaLista.getProximoNoDaLista();
        }

        return noRetorNoDaLista;
    }

    public T remove(int index){
        NoDaLista<T> noPivorDaLista = this.getNoDaLista(index);
        if (index == 0) {
            referenciaDeEntrada = noPivorDaLista.getProximoNoDaLista();
            return noPivorDaLista.getConteudo();
        }

        NoDaLista<T> noAnterior = getNoDaLista(index - 1);
        noAnterior.setProximoNoDaLista(noPivorDaLista.getProximoNoDaLista());
        return noPivorDaLista.getConteudo();
    }

    public void add(T conteudo){
        NoDaLista<T> novoNoDaLista = new NoDaLista<>(conteudo);
        if (this.isEmpty()) {
            referenciaDeEntrada = novoNoDaLista;
            return;
        }

        NoDaLista<T> noAuxiliarDaLista = referenciaDeEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAuxiliarDaLista = noAuxiliarDaLista.getProximoNoDaLista();
        }

        noAuxiliarDaLista.setProximoNoDaLista(novoNoDaLista);

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

    private void validaIndice(int index){
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index +" o ultimo indice é " + ultimoIndice + ".");
        }
    }

    @Override
    public String toString(){
        String strRetorno = ";";
        NoDaLista<T> noAuxiliar = referenciaDeEntrada;
         for(int i =0; i < this.size(); i++){
            strRetorno += "[No{conteudo}" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNoDaLista();
         }
         strRetorno += "null";        

        return strRetorno;
    }

}
