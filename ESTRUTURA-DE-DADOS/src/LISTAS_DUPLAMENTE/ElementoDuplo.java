public class ElementoDuplo<T> {
    private T conteudo;
    private ElementoDuplo<T> elementoProximo;
    private ElementoDuplo<T> elementoAnterior;

    public ElementoDuplo<T> getElementoProximo() {
        return elementoProximo;
    }

    public void setElementoProximo(ElementoDuplo<T> elementoProximo) {
        this.elementoProximo = elementoProximo;
    }

    public ElementoDuplo(T conteudo) {
        this.conteudo = conteudo;

    }

    public ElementoDuplo<T> getElementoAnterior() {
        return elementoAnterior;
    }

    public void setElementoAnterior(ElementoDuplo<T> elementoAnterior) {
        this.elementoAnterior = elementoAnterior;
    }
    @Override
    public String toString() {
        return "ElementoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }


}