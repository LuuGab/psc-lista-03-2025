import java.util.Scanner;
public class lista3q5 {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nInsira o primeiro algarismo: ");
    double number1 = scanner.nextDouble();

    System.out.print("\nInsira o segundo algarismo: ");
    double number2 = scanner.nextDouble();

    scanner.nextLine();
    System.out.print("\nInsira a operação matemática a ser utilizada (+,-,*,/,^): ");
    
    char operacao = scanner.nextLine().charAt(0);

    if (operacao !='+' && operacao != '-' && operacao != '*' && operacao != '/' && operacao != '^') {
        System.out.print("\nOperação Inválida.");
    } else {
    } if (operacao == '+') {
        double resultado = number1+number2;
        System.out.print("\nO resultado será de: "+ resultado);
    } if (operacao == '-') {
        double resultado = number1-number2;
        System.out.print("\nO resultado final será de: "+ resultado);
    } if (operacao == '*') {
        double resultado = number1*number2;
        System.out.print("\nO resultado final será de: "+ resultado);
    } if (operacao == '/') {
        if (number2 !=0) {
        double resultado = number1/number2;
        System.out.print("\nO resultado final será de: "+ resultado);
    } else {
        System.out.print("\nDivisão Inválida."); }
    } if (operacao == '^') {
        double resultado = Math.pow(number1, number2);
        System.out.print("\nO resultado final será de: "+ resultado);
    }
    scanner.close();
    }
}
