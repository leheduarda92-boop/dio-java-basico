import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;
public class Bootcamp {
    private String nome;
    private String descrição;
    private LocalDate dataInicial = LocalDate.now();
    private LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrição() {
        return descrição;
    }
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descrição='" + descrição + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", conteudos=" + conteudos +
                ", devsInscritos=" + devsInscritos +
                '}';
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bootcamp bootcamp = (Bootcamp) o;

        return Objects.equals(nome, bootcamp.nome)                && Objects.equals(descrição, bootcamp.descrição)
                && Objects.equals(dataInicial, bootcamp.dataInicial)
                && Objects.equals(dataFinal, bootcamp.dataFinal)
                && Objects.equals(conteudos, bootcamp.conteudos)
                && Objects.equals(devsInscritos, bootcamp.devsInscritos);
    }
    public int hashCode() {
        return Objects.hash(nome, descrição, dataInicial, dataFinal, conteudos, devsInscritos);
    }

}
