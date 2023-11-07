public class Pilha {
    
    private No refNoEntradaDaPilha;

    public Pilha() {
        this.refNoEntradaDaPilha = null;
    }

    public void push(No novNo){
        No refAuxiliar = refNoEntradaDaPilha;
        refNoEntradaDaPilha = novNo;
        refNoEntradaDaPilha.setRefProximoNo(refAuxiliar);
    }

    public No pop(){
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaDaPilha;
            refNoEntradaDaPilha = refNoEntradaDaPilha.getRefProximoNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaDaPilha;
    }

    public boolean isEmpty(){

        if(refNoEntradaDaPilha == null){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {

        String stringRetorno = "---------------\n    Pilha\n---------------\n";

        No noAuxiliar = refNoEntradaDaPilha;

        while (true) {
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefProximoNo();
            }else{
                break;
            }
        }
        stringRetorno += "===============\n";
        return stringRetorno;
    }

    

}
