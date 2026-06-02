public class ArvoreBinaria<T extends Comparable<T>> {
    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }
    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);

    }
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){ //verifica se a arvore está vazia
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){ //verifica se o novo nó é menor que o nó atual
            atual.setNoEsquerda(inserir(atual.getNoEsquerda(), novoNo));
        }else{
            atual.setNoDireita(inserir(atual.getNoDireita(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\nExibindo InOrdem");
        exibirInOrdem(raiz);
    }
    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsquerda());
            System.out.println(atual.getConteudo() + ",");
            exibirInOrdem(atual.getNoDireita()  );
        }
    }

     public void exibirPosOrdem(){
        System.out.println("\nExibindo PosOrdem");
        exibirPosOrdem(raiz);
    }
    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsquerda());
            exibirPosOrdem(atual.getNoDireita()  );
            System.out.println(atual.getConteudo() + ",");
        }
    }

     public void exibirPreOrdem(){
        System.out.println("\nExibindo PreOrdem");
        exibirPreOrdem(raiz);
    }
    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo() + ",");
            exibirPreOrdem(atual.getNoEsquerda());
            exibirPreOrdem(atual.getNoDireita()  );
        }
    }

    public void remover(T conteudo){
        try {
            BinNo<T> atual = raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){//verifica se o conteudo é menor que o nó atual
                    atual = atual.getNoEsquerda();//para saber se deve ir para a esquerda ou para a direita
                }else{
                    atual = atual.getNoDireita();
                }
            }
            if(atual == null){//se a arvore estiver vazia ou o conteudo não for encontrado
                System.out.println("Conteudo nao encontrado. Bloco try");
            }
            if(pai == null){
                if(atual.getNoDireita() == null){
                    this.raiz = atual.getNoEsquerda();
                }else if(atual.getNoEsquerda() == null){
                    this.raiz = atual.getNoDireita(); 
                }else{
                    for (temp = atual, filho = atual.getNoEsquerda(); 
                    filho.getNoDireita() !=null; temp = filho,
                     filho = filho.getNoDireita()) {
                        if (filho != atual.getNoEsquerda()) {
                            temp.setNoDireita(filho.getNoEsquerda());
                            filho.setNoEsquerda(raiz.getNoEsquerda());
                        }
                        
                    }
                    filho.setNoDireita(raiz.getNoDireita());
                    raiz = filho;
                }

            }else if(atual.getNoDireita() == null){
                if (pai.getNoEsquerda() == atual) {
                    pai.setNoEsquerda(atual.getNoEsquerda());   
                }else{
                    pai.setNoDireita(atual.getNoEsquerda());
                }

            }else if(atual.getNoEsquerda() == null){
                if (pai.getNoEsquerda() == atual) {
                    pai.setNoEsquerda(atual.getNoDireita());   
                }else{
                    pai.setNoDireita(atual.getNoDireita());
                }

            }else{
                for (temp = atual, filho = atual.getNoEsquerda(); 
                    filho.getNoDireita() !=null; 
                    temp = filho,filho = filho.getNoDireita()) {
                        if (filho != atual.getNoEsquerda()) {
                            temp.setNoDireita(filho.getNoEsquerda());
                            filho.setNoEsquerda(atual.getNoEsquerda());
                        }
                        
                    }
                    filho.setNoDireita(atual.getNoDireita());
                    if (pai.getNoEsquerda() == atual) {
                        pai.setNoEsquerda(filho);   
                    }else{
                        pai.setNoDireita(filho);
                    }

            }



        } catch (NullPointerException erro) { //exceção quando não encontrar o conteudo
            System.out.println("Conteudo nao encontrado. Bloco catch");
        }
    }

}
