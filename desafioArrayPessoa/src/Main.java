import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.
        Pessoa pessoa1 = new Pessoa();
        System.out.println("Digite o Nome Pessoa 1: ");
        pessoa1.setNome(scanner.next());
        System.out.println("Digite sua Idade Pessoa 1: ");
        pessoa1.setIdade(scanner.nextInt());

        Pessoa pessoa2 = new Pessoa();
        System.out.println("Digite o Nome Pessoa 2: ");
        pessoa2.setNome(scanner.next());
        System.out.println("Digite sua Idade Pessoa 2: ");
        pessoa2.setIdade(scanner.nextInt());

        Pessoa pessoa3 = new Pessoa();
        System.out.println("Digite o Nome Pessoa 3: ");
        pessoa3.setNome(scanner.next());
        System.out.println("Digite sua Idade Pessoa 3: ");
        pessoa3.setIdade(scanner.nextInt());

        //2.
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho Lista: " + listaDePessoas.size());
        System.out.println("Primeiro da fila " + listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas);

    }
}
