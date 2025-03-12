/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        1°
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite Um Numero: ");
        int numero = scanner.nextInt();
        if (numero > 0){
            System.out.println("Numero Positivo!!!");
        }else{
            System.out.println("Numero Negativo!!!");
        }
    }2°
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Primeiro Numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o Segundo Numero: ");
        int n2 = scanner.nextInt();
        if (n1 == n2){
            System.out.println("Numeros Iguais " + "N1 é %d, N2 é %d".formatted(n1,n2));
        }else{
            if (n1 > n2){
                System.out.println("O Numero maior é o N1 %d".formatted(n1));
            }else {
                System.out.println("O Numero maior é o N2 %d".formatted(n2));
            }
            System.out.println("Numeros Diferentes " + "N1 é %d, N2 é %d ".formatted(n1,n2));
        }
    } 3°
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a Opção 1. Quadrado ou 2. Circulo");
        int num = scanner.nextInt();
        int areaQ = 0;
        if (num == 1) {
            System.out.print("Digite o Valor da Base: ");
            int base = scanner.nextInt();
            System.out.print("Digite o Valor da altura: ");
            int altura = scanner.nextInt();
            if (base == altura) {
                areaQ = base * altura;
                System.out.print("A área do Quadrado é: " + areaQ);
            } else {
                System.out.println("Não é um Quadrado!");
            }
        } else {
            System.out.print("Digite o Valor do Diamentro: ");
            double diamento = scanner.nextDouble();
            double raio = Math.pow((diamento / 2), 2);
            double areaC = Math.PI * raio;
            System.out.println("Diamentro do Cisculo é: %.2f ".formatted(areaC));
        }
    }   4°
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite Um Numero: ");
        int num = scanner.nextInt();
        System.out.println(" A tabuada do %d é: ".formatted(num));
        for (int mult = 0; mult <=10; mult++){
            int result = num*mult;
            System.out.println("%d * %d = ".formatted(num,mult) +result);
        }5°
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite Um Numero: ");
        int num = scanner.nextInt();
        if (num % 2 == 1){
            System.out.println("Numero Impar!!!");
        }else {
            System.out.println("Numero Par!!!");
        }6°
        //tive um pouco de dificuldade ate acha um post na plataforma depois fiz umas implementações
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite Um Numero:");
        int n = scanner.nextInt();
        if (n >= 1) {
            int total = n;
            System.out.print("O fatorial de " + n + "!=");
            for (int fatorial = 1; fatorial < n; fatorial++) {
                total *= (n - fatorial);
                System.out.print(fatorial + "x");
            }
            System.out.println(n + "=" + total);
            n--;
        }
    }
}*/