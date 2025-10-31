import java.util.Scanner;

public class CalculadoraImposto {

    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = custo * (taxaImposto / 100);
        return custo + imposto;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo do item: R$ ");
        double custo = scanner.nextDouble();

        System.out.print("Digite a taxa de imposto (em %): ");
        double taxa = scanner.nextDouble();

        double custoFinal = somaImposto(taxa, custo);

        System.out.printf("O custo final com imposto é: R$ %.2f\n", custoFinal);
        
        scanner.close();
    }
}