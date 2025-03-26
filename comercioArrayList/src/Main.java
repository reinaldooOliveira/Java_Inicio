import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", 24.87, 150);
        Produto produto2 = new Produto("Feijao", 7.15, 57);

        ProdutoPerecivel perecivel = new ProdutoPerecivel("Peixe", 26.99,
                86, "25/03/2025");


        List<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(perecivel);
        listaDeProdutos.add(produto2);
        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(1).toString());
        System.out.println(listaDeProdutos.get(0).toString());
    }
}