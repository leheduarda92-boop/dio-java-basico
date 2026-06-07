public class Curso extends Conteudo {
    private int CargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * CargaHoraria;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso{");
        sb.append("Titulo=").append(getTitulo());
        sb.append(", Descri\u00e7\u00e3o=").append(getDescrição());
        sb.append(", CargaHoraria=").append(CargaHoraria);
        sb.append('}');
        return sb.toString();
    }


}
