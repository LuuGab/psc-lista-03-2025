import java.util.Scanner;
import java.util.Random;

public class lista3q6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("\nInsira o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("\nInsira o segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min (num1, num2);
        int maior = Math.max (num1, num2);

        int sorteio = random.nextInt((maior-menor) +1) + menor;

        if (sorteio % 2 ==0) {
            System.out.print("\nO número sorteado foi "+ sorteio +" e ele é par.");
        } else {
            System.out.print("\nO número sorteado foi "+ sorteio +" e ele é Impár.");
        }

        scanner.close();
    }
}
