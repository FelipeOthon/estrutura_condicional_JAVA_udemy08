import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        int peca1, peca2, numeroPecas1, numeroPecas2;
        double valorPeca1, valorPeca2;

        System.out.println("Digite codigo da peça 1: ");
        peca1 = scanner.nextInt();

        System.out.printf("Digite o valor da peça: ");
        valorPeca1 = scanner.nextDouble();

        System.out.println("Digite a quantidade de peças a ser comprado: ");
        numeroPecas1 = scanner.nextInt();

        System.out.println("Digite codigo da peça 1: ");
        peca2 = scanner.nextInt();

        System.out.printf("Digite o valor da peça: ");
        valorPeca2 = scanner.nextDouble();

        System.out.println("Digite a quantidade de peças a ser comprado: ");
        numeroPecas2 = scanner.nextInt();


        double totalPagar = numeroPecas1 * valorPeca1 + numeroPecas2 * valorPeca2;

        System.out.printf("O valor total a pagar é: %.2f", totalPagar);







        scanner.close();
    }
}