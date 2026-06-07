public abstract class Conteudo {


    protected static final double XP_PADRAO = 10d;

    private String Titulo;
    private String Descrição;

    public abstract double calcularXp();

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }


}
