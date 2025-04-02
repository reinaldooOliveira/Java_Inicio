import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
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
         A questão 2 não entedi muito, por que pra mim o casting funciona como a conversão
        de um tipo de dado para outro porem se o Objeto cachorro esta herdando de animal ele já
        não é do mesmo tipo?
        a questão 3 segue a mesma situação
        Cachorro cachorro2 = new Cachorro("Caramelo", 4,"Mamifero", "sobre 4 patas",
              "Latindo ou Rosnando");
        Animal animal = (Animal)cachorro2;


        Produto produto = new Produto("Bolacha", 4.50);
        Produto produto1 = new Produto("Sabão", 7.80);
        Produto produto2 = new Produto("Vela", 16.75);
        Produto produto3 = new Produto("Rodo", 21.89);
        List<Produto>listDeProdutos = new ArrayList<>();
        listDeProdutos.add(produto);
        listDeProdutos.add(produto1);
        listDeProdutos.add(produto2);
        listDeProdutos.add(produto3);
        double valrsum = 0;
        for (int opcao =0; opcao < listDeProdutos.size(); opcao++){
             valrsum += listDeProdutos.get(opcao).preco;
        }
        double precoMedio = valrsum / listDeProdutos.size();
        System.out.println("Preço Médio dos Produtos: %.2f ".formatted(precoMedio));*/


        Scanner scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();
        System.out.println("Digite o Valor do Raio do Circulo: 1°");
        circulo.raio = scanner.nextDouble();
        Quadrado quadrado = new Quadrado();
        System.out.println("Digite o Tamanho do Lado do Quadrado: 2°");
        quadrado.lado = scanner.nextDouble();
        List<Forma>listaDeFormas =new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);
        for(Forma forma : listaDeFormas){
            System.out.println("Área: %.2f ".formatted(forma.calcularArea()));
        }


    }
}