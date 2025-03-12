import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Digite Quantos Graus Celsios esta fazendo Hoje : ");
        int grau = scanner.nextInt();
        double temperatura = (grau * 1.8) + 32;
        System.out.println( """ 
                    Hoje estar Fazendo %d°C
                    e %.2f fahrenheit
                """.formatted(grau, temperatura));

        1° Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua 1° Nota:");
        float n1 = scanner.nextFloat();
        System.out.print("Digite sua 2° Nota:");
        float n2 = scanner.nextFloat();
        double media = (n1+n2)/2;
        System.out.println("Sua Media é: " + media);

        2° Declare uma variável do tipo double e uma variável do tipo int. Faça o casting
        da variável double para int e imprima o resultado.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua 1° variavel: ");
        double v1 = scanner.nextDouble();
        System.out.print("Digite sua 2° variavel: ");
        double v2 = scanner.nextDouble();
        int conv1 = (int) v1;
        int conv2 = (int) v2;
        System.out.println("""
                Suas Variaveis Interiras são %d e %d
                Foram convertidas das variaveis %.2f e %.2f
                """.formatted(conv1, conv2, v1, v2));

         3° Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
         Atribua valores a essas variáveis e concatene-as em uma mensagem.
        Scanner scanner = new Scanner(System.in);
        //Quando coloco para o condigo pedi primeiro a letra ele dar um bug onde pedi a letra ao usuario
         //logo depois ele pula para a impressão, não conseguir identificar a causa, não sei se foi somente um
         //bug da minha maquina
        System.out.print("Digite a 1° Letra do seu Nome: ");
        char letras = scanner.nextLine().charAt(0);
        System.out.print("Digite seu Nome: ");
        String nome = scanner.nextLine();
        System.out.println("""
                A primeira Letra do meu Nome é %s
                de %s
                """.formatted(letras, nome));

        4° Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
         Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Lista de Produtos:
                1.Lapis R$ 1,50
                2.Caneta R$ 2,30
                """);
        System.out.print("Digite o nome do Produto: ");
        String nome = scanner.nextLine();
        double precoProduto;
        if (nome.equals("Lapis")) {
         precoProduto = 1.50;
        } else {
            precoProduto = 2.50;
        }
        System.out.print("Digite a Quantidade: ");
        int quantidade = scanner.nextInt();
        double valor = precoProduto * quantidade;
        System.out.println("""
                O produto que você Comprou foi o %s de 
                %.2f e na quantidade de %d uni.
                Valor Final da compra foi de R$ %.2f.
                """.formatted(nome, precoProduto, quantidade, valor));

        /*5° Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere
         que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e
         imprima o resultado formatado.
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.print("Digite o valor a ser convertido: ");
        double v1 = scanner.nextDouble();
        System.out.print("Digite o valor dolar Atualmente:");
        double v2 = scanner.nextDouble();
        double conv1 = v1 / v2;
        System.out.println("""
                Valor a ser convertido é R$ %.2f
                Valor apos conversão U$ %.2f
                Valor do dolar em tempo real %.2f
                """.formatted(v1,conv1, v2));

        6° Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando
         o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua
         um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
         aplique-o ao preço original e imprima o novo preço com desconto.
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.print("Digite o valor do produto: ");
        double precoOriginal = scanner.nextDouble();
        System.out.print("Digite o valor do desconto:");
        double percentualDesconto = scanner.nextDouble();
        double valorFinal = precoOriginal - ((percentualDesconto / 100) * precoOriginal);
        System.out.println("""
                Valor Original é R$ %.2f
                Valor Desconto %.1f Porcento
                Valor Final %.2f
                """.formatted(precoOriginal, percentualDesconto, valorFinal));*/
    }
}