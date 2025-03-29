import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        cobra cobra1 = new cobra(true, 0,"Reptio", "Rastejando",
                "Principamente pelo toque");

        Cachorro cachorro1 = new Cachorro("REX", 4,"Mamifero", "sobre 4 patas",
                "Latindo ou Rosnando");

        Peixe peixe1 =new Peixe(0,"Osteichthyes", "Nadando",
                "Soltando Bolhas");

        List<Animal>listaanimais = new ArrayList<>();
        listaanimais.add(cobra1);
        listaanimais.add(cachorro1);
        listaanimais.add(peixe1);

        for (Animal lista:listaanimais){
            System.out.println(lista);
        }


    }
}