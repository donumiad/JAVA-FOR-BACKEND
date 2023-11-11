public class ListaCircular<T> {
    private NoListaCircular<T> cabeca;
    private NoListaCircular<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }


    public void add(T conteudo){
        NoListaCircular<T> novoNo = new NoListaCircular<>(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }


    public void remove(int index){
        if (index >= tamanhoLista) {
            throw new IndexOutOfBoundsException("Indice maior que o tamano da lista");
        }
        NoListaCircular<T> noAuxiliar = cauda;
        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista --;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private NoListaCircular<T> getNo(int index){
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("Lista vazia");
        }

        if (index == 0) {
            return this.cauda;
        }

        NoListaCircular<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }
    
    public int size(){
        return this.tamanhoLista;
    }

    public String str(){
        String srtRetorno = "";
        NoListaCircular<T> noAuxiliar = this.cauda;

        for(int i = 0; i < this.size(); i++){
            srtRetorno +="[No{conteudo = "+ noAuxiliar.getConteudo() +"}]-->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        srtRetorno += this.size() != 0 ? "(inicio)" : "()";
        return srtRetorno;
    }
}
