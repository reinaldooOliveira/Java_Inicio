import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Reinaldo");
        pessoa1.setIdade(26);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Ruth");
        pessoa2.setIdade(28);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Teste");
        pessoa3.setIdade(88);

        //2.
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho Lista: " + listaDePessoas.size());
        System.out.println("Primeiro da fila " + listaDePessoas.get(1).getNome());
        System.out.println(listaDePessoas);

    }
}
