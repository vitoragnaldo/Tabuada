import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número para gerar a tabuada
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        // Exibir a tabuada do número
        System.out.println("\nTabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fechar o scanner
        scanner.close();
    }
}
