import java.util.Scanner;
public class lista3q1 {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nDigite o primeiro algarismo:\t");
    int number1 = scanner.nextInt();

    System.out.print("\nDigite o segundo algarismo:\t");
    int number2 = scanner.nextInt();

    System.out.print("\nDigite o terceiro algarismo:\t");
    int number3 = scanner.nextInt();

    int maior = number1;
    if (number2>maior) {
        maior = number2;
    } if (number3>maior) {
        maior = number3;
    }
    int menor = number1;
    if (number2<menor) {
        menor = number2;
    } if (number3<menor) {
        menor = number3;
    }

    System.out.print("\nO Maior número inserido foi: "+ maior);
    System.out.print("\nO Menor número inserido foi: "+ menor);

    double media = (number1 + number2 + number3)/3;
    System.out.print("\nA Média Aritmética dos valores inseridos é: "+ media);
    
    scanner.close();
    }
}
