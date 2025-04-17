import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeroInt = new ArrayList<>();
        numeroInt.add(22);
        numeroInt.add(4);
        numeroInt.add(9);
        numeroInt.add(2);
        numeroInt.add(1);

        Collections.sort(numeroInt);

        System.out.println("Numeros Ordenados" + numeroInt);
    }
}