public class Titulo {
    String titulo;
    int anoDeLancamento;

    public Titulo(String titulo, int anoDeLancamento) {
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
}
