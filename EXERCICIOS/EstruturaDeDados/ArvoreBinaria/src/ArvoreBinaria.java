public class ArvoreBinaria<T extends Comparable<T>> {
    
    private BinNo<T> raiz;
    
    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void remover(T conteudo){
        try {
            BinNo<T> atual = this.raiz; //Objeto usado para armazenar o valor que será removido
            BinNo<T> pai = null;        //Objeto usado para armazenar o valor anterior ao conteúdo que será removido
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            /*Este while vai percorrer toda a arvore até encontrar o valor procurado na expressão 
             !atual.getConteudo().equals(conteudo), ou caso o objeto "atual" retorne null
             O objeto "pai" sempre estará um nível acima do objeto "atual". */
            while (atual != null && !atual.getConteudo().equals(conteudo)) { 
                pai = atual; /*salva o objeto "atual" como sendo o "pai", pois na intrução seguinte desceremos um nível abaixo na árvore*/           
                
                if (conteudo.compareTo(atual.getConteudo()) < 0) {      //Verifica se o conteúdo passado no argumento é menor que o conteudo no objeto "atual"
                    atual = atual.getNoEsq();       //SIM! Então vai para o ramo esquerdo da arvore
                }else{
                    atual = atual.getNoDir();       //NÃO! Vai para o ramo direito da arvore
                }
            }

            /*Este if é executado quando o conteudo passado no argumento do metodo "remover" não foi encontrado
             , ou a árvore está vazia*/
            if (atual == null) {System.out.println("Conteudo não encontrado. Bloco Try");}
            if (pai == null) {      //"pai" só será null se arvore está vazia ou o conteúdo a ser removido é a raiz
                if (atual.getNoDir() == null) { //Filho da direita é nulo?
                    this.raiz = atual.getNoEsq();   // Remove a raiz atual
                }else if(atual.getNoEsq() == null){ //Filho da esquerda é nulo? 
                    this.raiz = atual. getNoDir(); //Remove a raiz
                    
                    /*Para chgar neste else, a raiz deve ter filho direito e esquerdo não null */
                    }else{
                        for(temp = atual, filho = atual.getNoEsq();
                            filho.getNoDir() != null;
                            temp = filho, filho = filho.getNoEsq())
                        {
                                if (filho != atual.getNoEsq()) {
                                    temp.setNoDir(filho.getNoEsq());
                                    filho.setNoEsq(raiz.getNoEsq());
                                }
                        }
                }
                filho.setNoDir(raiz.getNoDir());
                raiz = filho;
            
            }
            /************************************************************************************************/
            //Caso o conteúdo tenha sido encontrado dentro da arvore
            else if (atual.getNoDir() == null) {    //O conteúdo à direita do nó a ser removido é null?
                if (pai.getNoEsq() == atual) {      //SIM! O conteúdo está do lado esquerdo do nó "pai"?
                    pai.setNoEsq(atual.getNoEsq()); /*SIM! Remove o nó, apontando a referencia do nó "pai"
                                                     para o nó posterior*/
                }else{
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if (atual.getNoEsq() == null) {
                if (pai.getNoEsq() == atual) { 
                    pai.setNoEsq(atual.getNoDir()); 
                }else{
                    pai.setNoDir(atual.getNoDir());
                }
                
            }else{
                for(
                    temp = atual, filho = atual.getNoEsq();
                    filho.getNoDir() != null;
                    temp = filho, filho = filho.getNoDir()
                ){
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }


            }


        } catch (NullPointerException erro) {
            System.out.println("Conteudo não encontrado. Bloco Catch");
        }
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if (atual == null){
            return novoNo;
        }else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrden");
        exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
    System.out.println("\n Exibindo PosOrden");
    exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
            
        }
    }
    public void exibirPreOrdem(){
    System.out.println("\n Exibindo PreOrden");
    exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

}
