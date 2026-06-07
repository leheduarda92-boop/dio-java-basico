
import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate Data;

    public Mentoria() {
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate Data) {
        this.Data = Data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mentoria{");
        sb.append("Titulo=").append(getTitulo());
        sb.append(", Descri\u00e7\u00e3o=").append(getDescrição());
        sb.append(", Data=").append(Data);
        sb.append('}');
        return sb.toString();
    }


}
