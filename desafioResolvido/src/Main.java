import java.util.Scanner;

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
            switch (opcao){
                case 1 -> System.out.println("Valor Atualizado: " + saldoAtual);
                case 2 ->{
                    System.out.println("Digite o Valor a Receber: ");
                    saldoAtual += scanner.nextDouble();
                    System.out.println("Valor atual é: " + saldoAtual);
                }
            }

        } while (opcao != 4);


    }
}