import java.util.Objects;
public class Obj extends ObjArvore<Obj> {
    Integer meuValor;

    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    public Obj(String meuValor) {
        this.meuValor = Integer.valueOf(meuValor);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(meuValor, obj.meuValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int compareTo(Obj o) {
        return this.meuValor.compareTo(o.meuValor);
    }

    @Override
    public String toString() {
        return "Obj{" +
                "meuValor=" + meuValor +
                '}';
    }

}
