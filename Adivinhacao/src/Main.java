import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numeroScan;
        int qtdTentativa = 1;


        while (qtdTentativa != -1){
            int random = new Random().nextInt(100);
            System.out.println("------------------------------------------------------");
            System.out.println("Ja foram %d Tentativas ".formatted(qtdTentativa));
            System.out.println("Escolha um numero de 0 a 100 ou escolha -1 para Sair:");
            numeroScan = scanner.nextInt();
            if (numeroScan == random){
                System.out.println("""
                        Numero Digitado foi %d
                        Numero Sortiado foi %d
                        Parabéns você acertou! """.formatted(numeroScan, random) );
                qtdTentativa++;
            } else if (numeroScan != random && numeroScan != -1){
                System.out.println("""
                        Numero Digitado foi %d
                        Numero Sortiado foi %d
                        Infelismente você não acertou! """.formatted(numeroScan, random) );
                qtdTentativa++;
            }else {
                System.out.println("Fim de Jogo");
                System.out.println("Quantidade de Tentativas " + qtdTentativa);
                break;
            }
        }

    }
}