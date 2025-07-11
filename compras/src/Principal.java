import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Limite do Cartão: ");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite a Descrição da Compra: ");
            String descricao = scanner.next();

            System.out.println("Digite o Valor da Compra: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean comprarealizada = cartao.lancaCompra(compra);

            if (comprarealizada){
                System.out.println("Compra Realizada !!! ");
                System.out.println("Digite '0' para Sair ou '1' para Continuar:");
                sair = scanner.nextInt();
            }else {
                System.out.println("Saldo Induficiente!!!");
                sair = 0;
            }
        }
        System.out.println("******************************************************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getCompras());
        int i = 1;
        for (Compra c : cartao.getCompras()){
            System.out.println( i+" - " + c.getDescricao() + " - " + "$" +c.getValor());
            i++;
        }

        System.out.println("\n*****************************************************");
        System.out.println("\nSaldo do Cartão: $" +cartao.getSaldo());
    }
}
