public class cobra extends Animal{
    boolean peconha;

    public boolean getPeconha() {
        return peconha;
    }

    public void setPeconha(boolean peconha) {
        this.peconha = peconha;
    }

    public cobra(boolean peconha, int membros, String classeAnimal, String movimenta, String comunicar) {
        super(membros, classeAnimal, movimenta, comunicar);
        this.peconha =peconha;
    }

    @Override
    public String toString() {
        return "Cobra{" +
                " peconha "+ peconha +
                ", membros= " + membros +
                ", classeAnimal=' " + classeAnimal + '\'' +
                ", movimenta=' " + movimenta + '\'' +
                ", comunicar=' " + comunicar + '\'' +
                '}';
    }
}
