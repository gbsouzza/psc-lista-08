import java.util.Scanner;

public class ConversorHorario {

    public static void converterEImprimir(int hora, int minuto) {
        String periodo = "A.M.";
        int horaConvertida = hora;

        if (hora == 0) {
            horaConvertida = 12;
        } else if (hora == 12) {
            periodo = "P.M.";
        } else if (hora > 12) {
            horaConvertida = hora - 12;
            periodo = "P.M.";
        }

        System.out.printf("Horário convertido: %d:%02d %s\n", horaConvertida, minuto, periodo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nDigite a hora (0-23) ou -1 para sair: ");
            int hora = scanner.nextInt();

            if (hora == -1) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Digite os minutos (0-59): ");
            int minuto = scanner.nextInt();

            if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
                System.out.println("Valores inválidos. Tente novamente.");
            } else {
                converterEImprimir(hora, minuto);
            }
        }
        
        scanner.close();
    }
}