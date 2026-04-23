import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.println("Digite sua nota (ou digite -1 para sair):");
            double nota = input.nextDouble();

            if (nota == -1) { 
                break; 
            }

            if (nota > 20) {
                System.out.println("Não minta!");
            } else if (nota == 20) {
                System.out.println("Parabens!");
            } else if (nota >= 18) {
                System.out.println("muito bom!");
            } else {
                System.out.println("Estude Mais!");
            }
        }
        
        System.out.println("Programa encerrado.");
        input.close();
    }
}

