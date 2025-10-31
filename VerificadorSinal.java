import java.util.Scanner;

public class VerificadorSinal {

    public static char verificar(double numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        
        char resultado = verificar(num);
        
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
}