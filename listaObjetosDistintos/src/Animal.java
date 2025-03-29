public class Animal {

    int membros;
    String classeAnimal;
    String movimenta;
    String comunicar;

    public Animal(int membros, String classeAnimal, String movimenta, String comunicar) {
        this.membros = membros;
        this.classeAnimal = classeAnimal;
        this.movimenta = movimenta;
        this.comunicar = comunicar;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public String getClasseAnimal() {
        return classeAnimal;
    }

    public void setClasseAnimal(String classeAnimal) {
        this.classeAnimal = classeAnimal;
    }

    public String getMovimenta() {
        return movimenta;
    }

    public void setMovimenta(String movimenta) {
        this.movimenta = movimenta;
    }

    public String getComunicar() {
        return comunicar;
    }

    public void setComunicar(String comunicar) {
        this.comunicar = comunicar;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "membros=" + membros +
                ", classeAnimal='" + classeAnimal + '\'' +
                ", movimenta='" + movimenta + '\'' +
                ", comunicar='" + comunicar + '\'' +
                '}';
    }
}
