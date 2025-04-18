import java.util.*;

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

        List<Titulo>listaTitulos;

        listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("Madagascar",2005));
        listaTitulos.add(new Titulo("Frozen", 2014));
        listaTitulos.add(new Titulo("Encanto", 2021));
        listaTitulos.add(new Titulo("Moana 2", 2024));

        Collections.sort(listaTitulos);
        for (Titulo titulo: listaTitulos){
            System.out.println("Filme " +titulo.nome + " Lançamento "+ titulo.dataLancamento);
        }
        System.out.println("------------------------------");
        listaTitulos = new LinkedList<>();
        listaTitulos.add(new Titulo("Lost", 2004));
        listaTitulos.add(new Titulo("Dark", 2020));
        for (Titulo serie:listaTitulos){
            System.out.println("Série " + serie.nome + " Lançamento "+ serie.dataLancamento);
        }




    }
}