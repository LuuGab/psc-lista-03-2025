import java.util.Scanner;
public class lista3q3 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nDigite o valor de a: ");
    double a = scanner.nextDouble();

    System.out.print("\nDigite o valor de b: ");
    double b = scanner.nextDouble();

    System.out.print("\nDigite o valor de c: ");
    double c = scanner.nextDouble();

    if (a ==0 && b ==0 && c !=0 ) {
        System.out.print("\nCoeficientes informados incorretamente.");
    } else if (a ==0 && b !=0) {
        System.out.print("\nEsta é uma equação de primeiro grau.");
        
        double raiz = -c/b;
        System.out.print("\nRaiz real: "+ raiz);
    } else {
        double delta = (b * b) - (4 * a * c);

        if (delta<0) {
            System.out.print("\nEsta equação não possui raizes reais.");
        } else if (delta==0) {
            System.out.print("\nEsta equação possui duas raizes reais.");

            double raiz = -b / (2 * a);
            System.out.print ("\nRaiz: "+ raiz);
        } else {
            System.out.print("\nEsta equação possui duas raizes reais diferentes.");

            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.print("\nRaiz 1: "+ raiz1);
            System.out.print ("\nRaiz 2: "+ raiz2);
        }

        }

        scanner.close();

        }
    }

