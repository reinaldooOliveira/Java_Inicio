public class Main {
    public static void main(String[] args) {

        Filme filme = new Filme(" The Matrix ", 1999);
        System.out.println("Titulo:" + filme.getTitulo() + "| Ano Lançamento: " +
                filme.getAnoDeLancamento());

        Serie serie = new Serie(" The Big Bag: Theory ", 2007);
        System.out.println("Titulo:" + serie.getTitulo() + "| Ano Lançamento: " +
                serie.getAnoDeLancamento());
    }
}