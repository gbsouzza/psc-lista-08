import java.util.Scanner;

public class SomaTresArgumentos {

    public static double somar(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();
        
        double resultado = somar(n1, n2, n3);
        
        System.out.println("A soma dos três números é: " + resultado);
        
        scanner.close();
    }
}