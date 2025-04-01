public class Cachorro extends Animal {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cachorro(String nome, int membros, String classeAnimal, String movimenta,
                    String comunicar) {

        super(membros, classeAnimal, movimenta, comunicar);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                " nome " + nome +
                ", membros= " + membros +
                ", classeAnimal='" + classeAnimal + '\'' +
                ", movimenta='" + movimenta + '\'' +
                ", comunicar='" + comunicar + '\'' +
                '}';
    }
}
