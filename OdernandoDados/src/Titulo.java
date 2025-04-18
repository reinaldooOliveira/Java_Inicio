

public class Titulo implements Comparable<Titulo> {
    String nome;
    int dataLancamento;

    public Titulo(String nome, int dataLancamento) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }/*
    @Override
    public int compareTo(Titulo outroLancamento) {
        return this.dataLancamento;

    }*/
}
