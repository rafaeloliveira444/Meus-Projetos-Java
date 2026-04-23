import java.util.Scanner;

public class SistemaAvaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- GESTÃO DE RENDIMENTO ACADÉMICO ---");
        
        System.out.print("Introduza a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Introduza a segunda nota: ");
        double nota2 = scanner.nextDouble();
        

        double mediaFinal = (nota1 + nota2) / 2;

        System.out.println("\n-------------------------------");
        System.out.printf("Média Final: %.2f%n", mediaFinal);

        if (mediaFinal >= 7.0 ) {
            System.out.println("Status Final: APROVADO");
        } else if (mediaFinal >= 5.0 ) {
            System.out.println("Status Final: EM RECUPERAÇÃO");
        } else {
            System.out.println("Status Final: REPROVADO");
        }
        System.out.println("-------------------------------");

        scanner.close();
    }
}