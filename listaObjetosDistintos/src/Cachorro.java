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
    }

    @Override
    public String toString() {
        return "Animal{" +
                " nome " + nome +
                " membros= " + membros +
                ", classeAnimal='" + classeAnimal + '\'' +
                ", movimenta='" + movimenta + '\'' +
                ", comunicar='" + comunicar + '\'' +
                '}';
    }
}
