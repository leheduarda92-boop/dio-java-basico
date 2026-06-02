public class ListaDuplamenteEncadeada<T> {
    private ElementoDuplo<T> primeiroElemento;
    private ElementoDuplo<T> ultimoElemento;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroElemento = null;
        this.ultimoElemento = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getElemento(index).getConteudo();
    }

    public void add(T elemento){
        ElementoDuplo<T> novoElemento = new ElementoDuplo<>(elemento);
        novoElemento.setElementoProximo(null);
        novoElemento.setElementoAnterior(this.ultimoElemento);
        if(primeiroElemento == null){
            this.primeiroElemento = novoElemento;
        }
        if(ultimoElemento != null){
            this.ultimoElemento.setElementoProximo(novoElemento);
        }
        ultimoElemento = novoElemento;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        ElementoDuplo<T> elementoAuxiliar = getElemento(index);
        ElementoDuplo<T> novoElemento = new ElementoDuplo<>(elemento);
        novoElemento.setElementoProximo(elementoAuxiliar);

        if(novoElemento.getElementoProximo() != null){
            novoElemento.setElementoAnterior(elementoAuxiliar.getElementoProximo());
            novoElemento.getElementoProximo().setElementoAnterior(novoElemento);

        }else{
            novoElemento.setElementoAnterior(ultimoElemento);
            ultimoElemento = novoElemento;
        }

        if(index == 0){
            primeiroElemento = novoElemento;
        }else{
            novoElemento.getElementoAnterior().setElementoProximo(novoElemento);
        }
        tamanhoLista++;
    }

    public void remove(int index){
        if(index == 0){ //remoção do primeiro elemento
            primeiroElemento = primeiroElemento.getElementoProximo();
            if(primeiroElemento != null){
                primeiroElemento.setElementoAnterior(null);
            }
        }else{ //remoção de um elemento do meio ou do final
            ElementoDuplo<T> elementoAuxiliar = getElemento(index);
            elementoAuxiliar.getElementoAnterior().setElementoProximo(elementoAuxiliar.getElementoProximo());
            if(elementoAuxiliar != ultimoElemento){
                elementoAuxiliar.getElementoProximo().setElementoAnterior(elementoAuxiliar.getElementoAnterior());
            }else{
                ultimoElemento = elementoAuxiliar;
            }
        }
        this.tamanhoLista--;

    }

    private ElementoDuplo<T> getElemento(int index){ // Método auxiliar para obter o elemento na posição index
        ElementoDuplo<T> elementoAuxiliar = this.primeiroElemento;
        for (int i = 0; (i < index) && (elementoAuxiliar != null); i++) {
            elementoAuxiliar = elementoAuxiliar.getElementoProximo();
        }
        return elementoAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }
    @Override
    public String toString(){
        String strRetorno = "";

        ElementoDuplo<T> elementoAuxiliar = this.primeiroElemento;
        for(int i = 0; i < size(); i++){
            strRetorno += "elemento[" + i + "]: " + elementoAuxiliar.getConteudo() + "\n";
            elementoAuxiliar = elementoAuxiliar.getElementoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }



}
