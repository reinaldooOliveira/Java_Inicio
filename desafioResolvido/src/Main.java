import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String tipoConta = "Corrente";
        double saldoIni = 1500.99;
        double saldoAtual = 0;
        String nome = "Reinaldo Alves de Oliveira";
        while (opcao != 4) {
            System.out.println("************************************");
            System.out.println("Dados do Cliente:");
            System.out.println("Nome:           " + nome);
            System.out.println("Tipo conta:     " + tipoConta);
            System.out.println("************************************");
            System.out.printf("""
                    Operações
                                        
                    1- Verificar Saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """);
            if (saldoAtual == 0) {
                saldoAtual = saldoIni;
            }
            opcao = scanner.nextInt();
            switch (opcao){
                case 1 -> System.out.println("Valor Atualizado: " + saldoAtual);
                case 2 ->{
                    System.out.println("Digite o Valor a Receber: ");
                    saldoAtual += scanner.nextDouble();
                    System.out.println("Valor atual é: " + saldoAtual);
                }
                case 3-> {
                    System.out.println("Digite o valor a Transferir: ");
                    double valortransferencia = scanner.nextDouble();
                    if (valortransferencia > saldoAtual){
                        System.out.println("Saldo insuficiente !!!");
                    }else {
                        saldoAtual -= valortransferencia;
                        System.out.println("Saldo atual : " + saldoAtual);
                    }
                }
                case 4-> {
                    System.out.println("Sair");
                    sleep(4000);
                }
                default -> System.out.println("Opção Invalida!!!");
            }


        };


    }
}