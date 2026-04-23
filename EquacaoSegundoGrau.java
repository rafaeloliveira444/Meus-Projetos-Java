import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, x1, x2;

        while (true) {
            System.out.println("\n--- Calculadora de Bhaskara ---");
            System.out.print("Informe o valor de A (ou 0 para sair): ");
            a = input.nextDouble();

            if (a == 0) {
                break;
            }

            System.out.print("Informe o valor de B: ");
            b = input.nextDouble();
            System.out.print("Informe o valor de C: ");
            c = input.nextDouble();

            delta = (b * b) - (4 * a * c);
            System.out.printf("Valor de Delta: %.2f\n", delta);

            if (delta < 0) {
                System.out.println("Para Delta negativo, nao existem raizes Reais.");
            } else if (delta == 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("Delta zero, temos duas raizes iguais: %.2f\n", x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Delta positivo. Raizes: x1 = %.2f, x2 = %.2f\n", x1, x2);
            }
        }

        System.out.println("Programa encerrado.");
        input.close();
    }
}

