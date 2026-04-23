import java.util.Scanner;

public class Frequência {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int aulas = 6;
        
        System.out.println("Faltou quantos dias?");
        int faltas = scanner.nextInt();
        
        // Calcula o total de horas/aulas perdidas
        int faltasTotal = aulas * faltas;
        
        // Verifica se está dentro do limite de 80
        if (faltasTotal < 80) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
        
        scanner.close();
    }
}
