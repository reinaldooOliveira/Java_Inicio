import java.util.Scanner;

import static java.lang.Thread.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String tipoConta = "Corrente";
        double saldoIni = 1500.99;
        double saldoAtual = 0;
        String nome = "Reinaldo Alves de Oliveira";
        double valortransferencia;
        do {
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
            System.out.println("Digite a Opção Desejada: ");
            opcao = scanner.nextInt();
            if (opcao == 1) {
                System.out.println("Valor Atualizado: " + saldoAtual);
                sleep(6000);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a Receber: ");
                saldoAtual += scanner.nextDouble();
                System.out.println("Valor Atual é:      " + saldoAtual);
                sleep(6000);
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser Transferido: ");
                valortransferencia = scanner.nextDouble();
                if (valortransferencia > saldoAtual) {
                    System.out.println("Saldo Transferencia maior que Saldo da Conta!!!!");
                    sleep(5000);
                } else {
                    saldoAtual -= valortransferencia;
                    System.out.println("Valor Atual é:      " + saldoAtual);
                    sleep(6000);
                }
            }else {
                System.out.println("Opção Invalida!!!");
                sleep(6000);
            }

        } while (opcao != 4);


    }

}
